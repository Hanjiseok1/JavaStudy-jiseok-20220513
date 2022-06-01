package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

public class School {
	private String schoolName;
	private String localSituation;
	private String schoolVacation;
	private LocalDate schoolAnniversary;
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(String schoolName, String localSituation, String schoolVacation, LocalDate schoolAnniversary) {
		super();
		this.schoolName = schoolName;
		this.localSituation = localSituation;
		this.schoolVacation = schoolVacation;
		this.schoolAnniversary = schoolAnniversary;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getLocalSituation() {
		return localSituation;
	}

	public void setLocalSituation(String localSituation) {
		this.localSituation = localSituation;
	}

	public String getSchoolVacation() {
		return schoolVacation;
	}

	public void setSchoolVacation(String schoolVacation) {
		this.schoolVacation = schoolVacation;
	}

	public LocalDate getSchoolAnniversary() {
		return schoolAnniversary;
	}

	public void setSchoolAnniversary(LocalDate schoolAnniversary) {
		this.schoolAnniversary = schoolAnniversary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(localSituation, schoolAnniversary, schoolName, schoolVacation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(localSituation, other.localSituation)
				&& Objects.equals(schoolAnniversary, other.schoolAnniversary)
				&& Objects.equals(schoolName, other.schoolName) && Objects.equals(schoolVacation, other.schoolVacation);
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", localSituation=" + localSituation + ", schoolVacation="
				+ schoolVacation + ", schoolAnniversary=" + schoolAnniversary + "]";
	}
	
	
}
