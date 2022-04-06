package at.campus02.iwi.vaccines;

public class VaccinationAppointment {

    public int calculateRiskClass(int age, boolean majorIllness, boolean contactOfPregnantPerson,
                                  boolean workingInHealthSector, boolean workingInEducationSector, boolean baseRiskFactor) {
        int riskFaktor = 0;
        riskFaktor += age / 10;
        if (majorIllness) {
            riskFaktor += 3;
        }
        if (contactOfPregnantPerson) {
            riskFaktor += 2;
        }
        if (workingInHealthSector) {
            riskFaktor += 2;
        }
        if (workingInEducationSector) {
            riskFaktor += 1;
        }
        if (baseRiskFactor) {
            riskFaktor += 1;
        }
        return riskFaktor;
    }
    public String calculateMonthAndVaccine (int age, int riskClass) {

    }
}
