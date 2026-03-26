 class Patient(
    var patientId: Int,
    var patientName: String,
    var age: Int,
    var disease: String
) {
    fun showDetails() {
        println("Patient ID: $patientId | Name: $patientName | Age: $age | Disease: $disease")
    }
}
class Doctor(
    var doctorId: Int,
    var doctorName: String,
    var specialization: String
) {
    fun showDoctor() {
        println("Doctor ID: $doctorId | Name: $doctorName | Specialization: $specialization")
    }
}
class Medicine(
    var medicineId: Int,
    var medicineName: String,
    var company: String
) {
    fun showMedicine() {
        println("Medicine ID: $medicineId | Name: $medicineName | Company: $company")
    }
}
class Appointment(
    var patientName: String,
    var doctorName: String,
    var date: String
) {
    fun showAppointment() {
        println("Patient: $patientName | Doctor: $doctorName | Date: $date")
    }
}

fun main(args: Array<String>) {

    val patients = mutableListOf<Patient>()
    val doctors = mutableListOf<Doctor>()
    val medicines = mutableListOf<Medicine>()
    val appointments = mutableListOf<Appointment>()

    while (true) {

        println("\n HOSPITAL MANAGEMENT SYSTEM")
        println("1. Add Patient")
        println("2. View Patients")
        println("3. Add Doctor")
        println("4. View Doctors")
        println("5. Add Medicine")
        println("6. View Medicines")
        println("7. Book Appointment")
        println("8. View Appointments")
        println("9. Delete Patient")
        println("10. Exit")
        print("Enter choice: ")

        when (readLine()!!.toInt()) {
            1 -> {
                print("Enter Patient ID: ")
                val id = readLine()!!.toInt()

                print("Enter Name: ")
                val name = readLine()!!

                print("Enter Age: ")
                val age = readLine()!!.toInt()

                print("Enter Disease: ")
                val disease = readLine()!!

                patients.add(Patient(id, name, age, disease))
                println("Patient Added")
            }
            2 -> {
                if (patients.isEmpty())
                    println("No patients available")
                else
                    patients.forEach { it.showDetails() }
            }
            3 -> {
                print("Enter Doctor ID: ")
                val id = readLine()!!.toInt()

                print("Enter Doctor Name: ")
                val name = readLine()!!

                print("Enter Specialization: ")
                val spec = readLine()!!

                doctors.add(Doctor(id, name, spec))
                println("Doctor Added")
            }
            4 -> {
                if (doctors.isEmpty())
                    println("No doctors available")
                else
                    doctors.forEach { it.showDoctor() }
            }

            5 -> {
                print("Enter Medicine ID: ")
                val id = readLine()!!.toInt()

                print("Enter Medicine Name: ")
                val name = readLine()!!

                print("Enter Company Name: ")
                val company = readLine()!!

                medicines.add(Medicine(id, name, company))
                println("Medicine Added")
            }
            6 -> {
                if (medicines.isEmpty())
                    println("No medicines available")
                else
                    medicines.forEach { it.showMedicine() }
            }
            7 -> {
                print("Enter Patient Name: ")
                val pName = readLine()!!

                print("Enter Doctor Name: ")
                val dName = readLine()!!

                print("Enter Appointment Date: ")
                val date = readLine()!!

                appointments.add(Appointment(pName, dName, date))
                println("Appointment Booked")
            }
            8 -> {
                if (appointments.isEmpty())
                    println("No appointments available")
                else
                    appointments.forEach { it.showAppointment() }
            }
            9 -> {
                print("Enter Patient ID to delete: ")
                val id = readLine()!!.toInt()

                val removed = patients.removeIf { it.patientId == id }

                if (removed)
                    println("Patient Deleted")
                else
                    println("Patient not found")
            }
            10 -> {
                println("Thank you for using Hospital Management System!")
                break
            }

            else -> println("Invalid choice!")
        }
    }
}