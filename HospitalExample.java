package hello;

public class HospitalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoctorValue doctorVo = new DoctorValue();
		NurseValue nurseVo = new NurseValue();
		PatientValue patientVo = new PatientValue();
		PersonValue personVo = new PersonValue();
		
		System.out.println("Doctor Info : " + doctorVo.getInfo());
		System.out.println("Nurse Info : " + nurseVo.getInfo());
		System.out.println("Patient Info : " + patientVo.getInfo());
		System.out.println("Person Info : " + personVo.getInfo());
	}

}
