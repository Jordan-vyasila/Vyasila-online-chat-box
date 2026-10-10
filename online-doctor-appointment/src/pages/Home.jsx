import { Link } from 'react-router-dom'
import DoctorCard from '../components/DoctorCard'
import { doctors } from '../data/doctors'

export default function Home() {
  const featured = doctors.slice(0, 3)

  return (
    <>
      <section className="hero">
        <div className="hero-media" aria-hidden="true" />
        <div className="container hero-content">
          <p className="hero-brand">VyasilaCare</p>
          <h1>See a doctor online, on your schedule.</h1>
          <p>
            Choose a specialist, pick a slot, and confirm your visit — without
            the clinic wait.
          </p>
          <div className="hero-actions">
            <Link to="/doctors" className="btn btn-accent">
              Find a doctor
            </Link>
            <Link to="/appointments" className="btn btn-secondary" style={{ color: '#fff', borderColor: 'rgba(255,255,255,0.45)' }}>
              View appointments
            </Link>
          </div>
        </div>
      </section>

      <section className="section">
        <div className="container">
          <div className="section-head">
            <div>
              <h2>Featured clinicians</h2>
              <p>Trusted doctors ready for consultations this week.</p>
            </div>
            <Link to="/doctors" className="btn btn-secondary">
              Browse all
            </Link>
          </div>
          <div className="doctor-grid">
            {featured.map((doctor, index) => (
              <DoctorCard key={doctor.id} doctor={doctor} index={index} />
            ))}
          </div>
        </div>
      </section>
    </>
  )
}
