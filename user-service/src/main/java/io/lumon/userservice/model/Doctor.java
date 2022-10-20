package io.lumon.userservice.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
public class Doctor extends User {
    private String position;
    private double experience;

    public Doctor(long id, String firstName, String lastName,
                  String mobileNumber, String position, double experience) {
        super(id, firstName, lastName, mobileNumber);
        this.position = position;
        this.experience = experience;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Doctor{");
        sb.append("id=").append(getId());
        sb.append(", firstName='").append(getFirstName()).append('\'');
        sb.append(", lastName='").append(getLastName()).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", experience=").append(experience);
        sb.append('}');
        return sb.toString();
    }
}
