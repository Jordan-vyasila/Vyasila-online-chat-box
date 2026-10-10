const STORAGE_KEY = 'vyasilacare-appointments'

export function getAppointments() {
  try {
    const raw = localStorage.getItem(STORAGE_KEY)
    return raw ? JSON.parse(raw) : []
  } catch {
    return []
  }
}

export function saveAppointments(appointments) {
  localStorage.setItem(STORAGE_KEY, JSON.stringify(appointments))
}

export function bookAppointment(appointment) {
  const appointments = getAppointments()
  const conflict = appointments.find(
    (item) =>
      item.status !== 'cancelled' &&
      item.doctorId === appointment.doctorId &&
      item.date === appointment.date &&
      item.time === appointment.time,
  )

  if (conflict) {
    throw new Error('That time slot is already booked. Please choose another.')
  }

  const next = [
    {
      id: crypto.randomUUID(),
      createdAt: new Date().toISOString(),
      status: 'confirmed',
      ...appointment,
    },
    ...appointments,
  ]

  saveAppointments(next)
  return next
}

export function cancelAppointment(id) {
  const next = getAppointments().map((item) =>
    item.id === id ? { ...item, status: 'cancelled' } : item,
  )
  saveAppointments(next)
  return next
}

export function getBookedSlots(doctorId, date) {
  return getAppointments()
    .filter(
      (item) =>
        item.status !== 'cancelled' &&
        item.doctorId === doctorId &&
        item.date === date,
    )
    .map((item) => item.time)
}
