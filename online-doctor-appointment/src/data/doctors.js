export const specialties = [
  'All',
  'General Practice',
  'Cardiology',
  'Pediatrics',
  'Dermatology',
  'Orthopedics',
  'Gynecology',
]

export const timeSlots = [
  '09:00',
  '09:30',
  '10:00',
  '10:30',
  '11:00',
  '11:30',
  '14:00',
  '14:30',
  '15:00',
  '15:30',
  '16:00',
  '16:30',
]

export const doctors = [
  {
    id: 'dr-amani',
    name: 'Dr. Amani Mwangi',
    specialty: 'General Practice',
    experience: 12,
    fee: 35,
    rating: 4.9,
    patients: '2.4k+',
    location: 'Dar es Salaam',
    days: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri'],
    bio: 'Board-certified family physician focused on preventive care and chronic disease management for adults and families.',
    image:
      'https://images.unsplash.com/photo-1559839734-2b71ea197ec2?auto=format&fit=crop&w=900&q=80',
  },
  {
    id: 'dr-hassan',
    name: 'Dr. Hassan Juma',
    specialty: 'Cardiology',
    experience: 15,
    fee: 60,
    rating: 4.8,
    patients: '1.8k+',
    location: 'Dar es Salaam',
    days: ['Mon', 'Wed', 'Fri'],
    bio: 'Interventional cardiologist helping patients manage heart health with clear plans and careful follow-up.',
    image:
      'https://images.unsplash.com/photo-1612349317150-e413f6a5b16d?auto=format&fit=crop&w=900&q=80',
  },
  {
    id: 'dr-neema',
    name: 'Dr. Neema Lyimo',
    specialty: 'Pediatrics',
    experience: 10,
    fee: 40,
    rating: 4.9,
    patients: '3.1k+',
    location: 'Arusha',
    days: ['Tue', 'Wed', 'Thu', 'Sat'],
    bio: 'Warm, thorough pediatrician supporting childhood growth, vaccinations, and common childhood illnesses.',
    image:
      'https://images.unsplash.com/photo-1594824476967-48c8b964273f?auto=format&fit=crop&w=900&q=80',
  },
  {
    id: 'dr-sofia',
    name: 'Dr. Sofia Kimaro',
    specialty: 'Dermatology',
    experience: 9,
    fee: 45,
    rating: 4.7,
    patients: '1.5k+',
    location: 'Dar es Salaam',
    days: ['Mon', 'Tue', 'Thu', 'Fri'],
    bio: 'Dermatologist treating acne, eczema, and skin concerns with practical routines patients can stick to.',
    image:
      'https://images.unsplash.com/photo-1651008376811-b90baee60c1f?auto=format&fit=crop&w=900&q=80',
  },
  {
    id: 'dr-baraka',
    name: 'Dr. Baraka Mushi',
    specialty: 'Orthopedics',
    experience: 14,
    fee: 55,
    rating: 4.8,
    patients: '1.9k+',
    location: 'Mwanza',
    days: ['Mon', 'Wed', 'Thu', 'Fri'],
    bio: 'Sports and joint specialist helping patients recover mobility after injuries and everyday strain.',
    image:
      'https://images.unsplash.com/photo-1622253692010-333f2da6031d?auto=format&fit=crop&w=900&q=80',
  },
  {
    id: 'dr-grace',
    name: 'Dr. Grace Shirima',
    specialty: 'Gynecology',
    experience: 11,
    fee: 50,
    rating: 4.9,
    patients: '2.2k+',
    location: 'Dodoma',
    days: ['Tue', 'Wed', 'Fri', 'Sat'],
    bio: 'Women’s health specialist offering respectful consultations for routine care and ongoing concerns.',
    image:
      'https://images.unsplash.com/photo-1537368910025-700350fe46c7?auto=format&fit=crop&w=900&q=80',
  },
]

export function getDoctorById(id) {
  return doctors.find((doctor) => doctor.id === id)
}
