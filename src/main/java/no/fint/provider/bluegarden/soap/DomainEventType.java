
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DomainEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NewEmployee"/&gt;
 *     &lt;enumeration value="ReEmployee"/&gt;
 *     &lt;enumeration value="ChangeEmployee"/&gt;
 *     &lt;enumeration value="TerminateEmployee"/&gt;
 *     &lt;enumeration value="FixedSalary"/&gt;
 *     &lt;enumeration value="NewVTT"/&gt;
 *     &lt;enumeration value="LeaveAbsence"/&gt;
 *     &lt;enumeration value="SicknessAbsence"/&gt;
 *     &lt;enumeration value="HolidayAbsence"/&gt;
 *     &lt;enumeration value="NewOrganisation"/&gt;
 *     &lt;enumeration value="ChangeOrganisation"/&gt;
 *     &lt;enumeration value="CompleteOrganisation"/&gt;
 *     &lt;enumeration value="UserMessage"/&gt;
 *     &lt;enumeration value="AccessMessage"/&gt;
 *     &lt;enumeration value="NewAdditionalInformation"/&gt;
 *     &lt;enumeration value="ChangeAdditionalInformation"/&gt;
 *     &lt;enumeration value="EndAdditionalInformation"/&gt;
 *     &lt;enumeration value="ChangeWorkschedule"/&gt;
 *     &lt;enumeration value="PayrollJob"/&gt;
 *     &lt;enumeration value="AbsenceUsed"/&gt;
 *     &lt;enumeration value="AutoMove"/&gt;
 *     &lt;enumeration value="Taxcard"/&gt;
 *     &lt;enumeration value="NewSalarySimulation"/&gt;
 *     &lt;enumeration value="NewPayElementCalculation"/&gt;
 *     &lt;enumeration value="MoveEmployeeToNewEmployer"/&gt;
 *     &lt;enumeration value="ChangePublicHolidays"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DomainEventType", namespace = "http://datatypes.bluegarden.no/object/v3")
@XmlEnum
public enum DomainEventType {

    @XmlEnumValue("NewEmployee")
    NEW_EMPLOYEE("NewEmployee"),
    @XmlEnumValue("ReEmployee")
    RE_EMPLOYEE("ReEmployee"),
    @XmlEnumValue("ChangeEmployee")
    CHANGE_EMPLOYEE("ChangeEmployee"),
    @XmlEnumValue("TerminateEmployee")
    TERMINATE_EMPLOYEE("TerminateEmployee"),
    @XmlEnumValue("FixedSalary")
    FIXED_SALARY("FixedSalary"),
    @XmlEnumValue("NewVTT")
    NEW_VTT("NewVTT"),
    @XmlEnumValue("LeaveAbsence")
    LEAVE_ABSENCE("LeaveAbsence"),
    @XmlEnumValue("SicknessAbsence")
    SICKNESS_ABSENCE("SicknessAbsence"),
    @XmlEnumValue("HolidayAbsence")
    HOLIDAY_ABSENCE("HolidayAbsence"),
    @XmlEnumValue("NewOrganisation")
    NEW_ORGANISATION("NewOrganisation"),
    @XmlEnumValue("ChangeOrganisation")
    CHANGE_ORGANISATION("ChangeOrganisation"),
    @XmlEnumValue("CompleteOrganisation")
    COMPLETE_ORGANISATION("CompleteOrganisation"),
    @XmlEnumValue("UserMessage")
    USER_MESSAGE("UserMessage"),
    @XmlEnumValue("AccessMessage")
    ACCESS_MESSAGE("AccessMessage"),
    @XmlEnumValue("NewAdditionalInformation")
    NEW_ADDITIONAL_INFORMATION("NewAdditionalInformation"),
    @XmlEnumValue("ChangeAdditionalInformation")
    CHANGE_ADDITIONAL_INFORMATION("ChangeAdditionalInformation"),
    @XmlEnumValue("EndAdditionalInformation")
    END_ADDITIONAL_INFORMATION("EndAdditionalInformation"),
    @XmlEnumValue("ChangeWorkschedule")
    CHANGE_WORKSCHEDULE("ChangeWorkschedule"),

    /**
     * V. L\u00f8nk\u00f8rsel
     * 
     */
    @XmlEnumValue("PayrollJob")
    PAYROLL_JOB("PayrollJob"),

    /**
     * Brugt frav\u00e6r ifm. l\u00f8nk\u00f8rsel
     * 
     */
    @XmlEnumValue("AbsenceUsed")
    ABSENCE_USED("AbsenceUsed"),

    /**
     * Autoryk v. l\u00f8nk\u00f8rsel
     * 
     */
    @XmlEnumValue("AutoMove")
    AUTO_MOVE("AutoMove"),

    /**
     * Skattekort
     * 
     */
    @XmlEnumValue("Taxcard")
    TAXCARD("Taxcard"),
    @XmlEnumValue("NewSalarySimulation")
    NEW_SALARY_SIMULATION("NewSalarySimulation"),
    @XmlEnumValue("NewPayElementCalculation")
    NEW_PAY_ELEMENT_CALCULATION("NewPayElementCalculation"),
    @XmlEnumValue("MoveEmployeeToNewEmployer")
    MOVE_EMPLOYEE_TO_NEW_EMPLOYER("MoveEmployeeToNewEmployer"),
    @XmlEnumValue("ChangePublicHolidays")
    CHANGE_PUBLIC_HOLIDAYS("ChangePublicHolidays");
    private final String value;

    DomainEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DomainEventType fromValue(String v) {
        for (DomainEventType c: DomainEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
