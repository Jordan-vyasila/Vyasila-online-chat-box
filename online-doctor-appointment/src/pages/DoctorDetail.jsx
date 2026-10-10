import { useMemo, useState } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom'
import { getDoctorById, timeSlots } from '../data/doctors'
import { bookAppointment, getBookedSlots } from '../lib/appointments'

function tomorrowIso() {
  const date = new Date()
  date.setDate(date.getDate() + 1)
  return date.toISOString().slice(0, 10)
}

export default function DoctorDetail() {
  const { id } = useParams()
  const navigate = useNavigate()
  const doctor = getDoctorById(id)

  const [patientName, setPatientName] = useState('')
  const [phone, setPhone] = useState('')
  const [date, setDate] = useState(tomorrowIso())
  const [time, setTime] = useState('')
  const [message, setMessage] = useState(null)
  const [error, setError] = useState(null)

  const bookedSlots = useMemo(() => getBookedSlots(id, date), [id, date, message])

  if (!doctor) {
    return (
      <section className="section">
        <div className="container empty-state">
          <h2>Doctor not found</h2>
          <p>That profile is unavailable.</p>
          <Link to="/doctors" className="btn btn-primary" style={{ marginTop: '1rem' }}>
            Back to doctors
          </Link>
        </div>
      </section>
    )
  }

  function handleSubmit(event) {
    event.preventDefault()
    setError(null)
    setMessage(null)

    if (!patientName.trim() || !phone.trim() || !date || !time) {
      setError('Please complete your name, phone, date, and time slot.')
      return
    }

    try {
      bookAppointment({
        doctorId: doctor.id,
        doctorName: doctor.name,
        specialty: doctor.specialty,
        doctorImage: doctor.image,
        patientName: patientName.trim(),
        phone: phone.trim(),
        date,
        time,
        fee: doctor.fee,
      })
      setMessage('Appointment confirmed. Redirecting to your bookings…')
      setTimeout(() => navigate('/appointments'), 700)
    } catch (err) {
      setError(err.message)
    }
  }

  return (
    <div className="container detail-layout">
      <article className="detail-panel">
        <img src={doctor.image} alt={doctor.name} />
        <div className="detail-copy">
          <span className="specialty-tag">{doctor.specialty}</span>
          <h1>{doctor.name}</h1>
          <p>{doctor.bio}</p>
          <p>
            Available {doctor.days.join(', ')} · Based in {doctor.location}
          </p>
          <div className="stat-row">
            <div className="stat">
              <strong>{doctor.experience} yrs</strong>
              <span>Experience</span>
            </div>
            <div className="stat">
              <strong>★ {doctor.rating}</strong>
              <span>Patient rating</span>
            </div>
            <div className="stat">
              <strong>${doctor.fee}</strong>
              <span>Consult fee</span>
            </div>
          </div>
        </div>
      </article>

      <form className="booking-panel" onSubmit={handleSubmit}>
        <h2>Book appointment</h2>
        <p className="lede">Choose a day and open slot. Confirmation is instant.</p>

        <label className="field">
          <span>Your full name</span>
          <input
            value={patientName}
            onChange={(event) => setPatientName(event.target.value)}
            placeholder="Jordan Vyasila"
            autoComplete="name"
          />
        </label>

        <label className="field">
          <span>Phone number</span>
          <input
            value={phone}
            onChange={(event) => setPhone(event.target.value)}
            placeholder="+255 700 000 000"
            autoComplete="tel"
          />
        </label>

        <label className="field">
          <span>Date</span>
          <input
            type="date"
            min={tomorrowIso()}
            value={date}
            onChange={(event) => {
              setDate(event.target.value)
              setTime('')
            }}
          />
        </label>

        <div className="field">
          <span>Time slot</span>
          <div className="slot-grid">
            {timeSlots.map((slot) => {
              const taken = bookedSlots.includes(slot)
              return (
                <button
                  key={slot}
                  type="button"
                  className={`slot${time === slot ? ' active' : ''}`}
                  disabled={taken}
                  onClick={() => setTime(slot)}
                >
                  {slot}
                </button>
              )
            })}
          </div>
        </div>

        {error ? <div className="notice error">{error}</div> : null}
        {message ? <div className="notice">{message}</div> : null}

        <div className="form-actions">
          <button type="submit" className="btn btn-primary">
            Confirm booking · ${doctor.fee}
          </button>
          <Link to="/doctors" className="btn btn-ghost">
            ← Choose another doctor
          </Link>
        </div>
      </form>
    </div>
  )
}
