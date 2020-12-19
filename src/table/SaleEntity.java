package table;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Sale", schema = "dbo", catalog = "Sales")
public class SaleEntity {
    private int id;
    private String name;
    private Timestamp saleTime;

    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SaleTime")
    public Timestamp getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Timestamp saleTime) {
        this.saleTime = saleTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleEntity that = (SaleEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(saleTime, that.saleTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, saleTime);
    }
}
