import { NavLink, Outlet } from 'react-router-dom'

export default function Layout() {
  return (
    <div className="app-shell">
      <header className="site-header">
        <div className="container nav">
          <NavLink to="/" className="brand" end>
            <span className="brand-mark">V</span>
            VyasilaCare
          </NavLink>
          <nav className="nav-links" aria-label="Primary">
            <NavLink to="/" end>
              Home
            </NavLink>
            <NavLink to="/doctors">Doctors</NavLink>
            <NavLink to="/appointments">My appointments</NavLink>
          </nav>
          <NavLink to="/doctors" className="btn btn-primary">
            Book now
          </NavLink>
        </div>
      </header>

      <main>
        <Outlet />
      </main>

      <footer className="site-footer">
        <div className="container footer-inner">
          <span>VyasilaCare — Online Doctor Appointment</span>
          <span>Book verified doctors. Manage visits in minutes.</span>
        </div>
      </footer>
    </div>
  )
}
