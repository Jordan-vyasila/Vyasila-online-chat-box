import { useMemo, useState } from 'react'
import DoctorCard from '../components/DoctorCard'
import { doctors, specialties } from '../data/doctors'

export default function Doctors() {
  const [specialty, setSpecialty] = useState('All')
  const [query, setQuery] = useState('')

  const filtered = useMemo(() => {
    const q = query.trim().toLowerCase()
    return doctors.filter((doctor) => {
      const matchesSpecialty =
        specialty === 'All' || doctor.specialty === specialty
      const matchesQuery =
        !q ||
        doctor.name.toLowerCase().includes(q) ||
        doctor.specialty.toLowerCase().includes(q) ||
        doctor.location.toLowerCase().includes(q)
      return matchesSpecialty && matchesQuery
    })
  }, [specialty, query])

  return (
    <section className="section">
      <div className="container">
        <div className="section-head">
          <div>
            <h2 className="page-title">Our doctors</h2>
            <p className="lede">
              Filter by specialty or search by name and city.
            </p>
          </div>
        </div>

        <label className="field" style={{ marginBottom: '1rem', maxWidth: 420 }}>
          <span>Search</span>
          <input
            type="search"
            placeholder="e.g. Cardiology or Dar es Salaam"
            value={query}
            onChange={(event) => setQuery(event.target.value)}
          />
        </label>

        <div className="filters" role="tablist" aria-label="Specialty filters">
          {specialties.map((item) => (
            <button
              key={item}
              type="button"
              className={`filter-chip${specialty === item ? ' active' : ''}`}
              onClick={() => setSpecialty(item)}
            >
              {item}
            </button>
          ))}
        </div>

        {filtered.length === 0 ? (
          <div className="empty-state">
            <h3>No doctors match that search</h3>
            <p>Try another specialty or clear the search box.</p>
          </div>
        ) : (
          <div className="doctor-grid">
            {filtered.map((doctor, index) => (
              <DoctorCard key={doctor.id} doctor={doctor} index={index} />
            ))}
          </div>
        )}
      </div>
    </section>
  )
}
