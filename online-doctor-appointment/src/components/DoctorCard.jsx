import { Link } from 'react-router-dom'

export default function DoctorCard({ doctor, index = 0 }) {
  return (
    <Link
      to={`/doctors/${doctor.id}`}
      className="doctor-link"
      style={{ animationDelay: `${index * 70}ms` }}
    >
      <img className="doctor-photo" src={doctor.image} alt={doctor.name} />
      <div className="doctor-body">
        <span className="specialty-tag">{doctor.specialty}</span>
        <h3>{doctor.name}</h3>
        <div className="doctor-meta">
          <span>{doctor.experience} yrs experience</span>
          <span>★ {doctor.rating}</span>
          <span>${doctor.fee} consult</span>
        </div>
      </div>
    </Link>
  )
}
