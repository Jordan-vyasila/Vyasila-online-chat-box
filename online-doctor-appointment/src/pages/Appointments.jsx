import { useState } from 'react'
import { Link } from 'react-router-dom'
import { cancelAppointment, getAppointments } from '../lib/appointments'

function formatDate(value) {
  return new Date(`${value}T00:00:00`).toLocaleDateString(undefined, {
    weekday: 'short',
    month: 'short',
    day: 'numeric',
    year: 'numeric',
  })
}

export default function Appointments() {
  const [appointments, setAppointments] = useState(() => getAppointments())

  function handleCancel(id) {
    setAppointments(cancelAppointment(id))
  }

  return (
    <section className="section">
      <div className="container">
        <div className="section-head">
          <div>
            <h2 className="page-title">My appointments</h2>
            <p className="lede">
              Confirmed visits are saved in this browser. Cancel anytime before
              your slot.
            </p>
          </div>
          <Link to="/doctors" className="btn btn-primary">
            Book another
          </Link>
        </div>

        {appointments.length === 0 ? (
          <div className="empty-state">
            <h3>No appointments yet</h3>
            <p>Browse doctors and reserve your first visit.</p>
            <Link to="/doctors" className="btn btn-accent" style={{ marginTop: '1rem' }}>
              Find a doctor
            </Link>
          </div>
        ) : (
          <div className="appointments-list">
            {appointments.map((item, index) => (
              <article
                key={item.id}
                className="appointment-row"
                style={{ animationDelay: `${index * 60}ms` }}
              >
                <img src={item.doctorImage} alt={item.doctorName} />
                <div>
                  <h3>{item.doctorName}</h3>
                  <p>
                    {item.specialty} · {formatDate(item.date)} at {item.time}
                  </p>
                  <p>
                    Patient: {item.patientName} · {item.phone}
                  </p>
                  <span className={`status ${item.status}`}>{item.status}</span>
                </div>
                {item.status !== 'cancelled' ? (
                  <button
                    type="button"
                    className="btn btn-secondary"
                    onClick={() => handleCancel(item.id)}
                  >
                    Cancel
                  </button>
                ) : (
                  <span />
                )}
              </article>
            ))}
          </div>
        )}
      </div>
    </section>
  )
}
