package fr.hb.ElectricBusiness.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.NonNull;

@Entity
public class Reservation {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @NonNull
    private Borne borne;

    public Reservation(@NonNull Borne borne) {
        this.borne = borne;
    }

    public Reservation(Long id, @NonNull Borne borne) {
        this.id = id;
        this.borne = borne;
    }

    public Reservation() {
    }

    public Long getId() {
        return this.id;
    }

    public @NonNull Borne getBorne() {
        return this.borne;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBorne(@NonNull Borne borne) {
        this.borne = borne;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Reservation)) return false;
        final Reservation other = (Reservation) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$borne = this.getBorne();
        final Object other$borne = other.getBorne();
        if (this$borne == null ? other$borne != null : !this$borne.equals(other$borne)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Reservation;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $borne = this.getBorne();
        result = result * PRIME + ($borne == null ? 43 : $borne.hashCode());
        return result;
    }

    public String toString() {
        return "Reservation(id=" + this.getId() + ", borne=" + this.getBorne() + ")";
    }
}