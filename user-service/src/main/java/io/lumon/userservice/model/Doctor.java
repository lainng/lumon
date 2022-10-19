package io.lumon.userservice.model;

import java.util.Objects;

public class Doctor extends User {
    private String position;
    private int experience;

    public Doctor(long id, String firstName, String lastName, String position, int experience) {
        super(id, firstName, lastName);
        this.position = position;
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return experience == doctor.experience
                && Objects.equals(position, doctor.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), position, experience);
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
