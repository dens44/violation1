package persistenceAdapter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "violation")

public class ViolationDAO {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private Long violationId;
        @Column
        private Long lattitude;
        @Column
        private Long longtitude;
        @Column
        private Date date;
        @Column
        private String Value;

        public Long getViolationId() {
            return violationId;
        }

      public void setViolationId(Long violationId) {
        this.violationId = violationId;
       }

        public Long getLattitude() {
            return lattitude;
        }

        public void setLattitude(Long lattitude) {
            this.lattitude = lattitude;
        }

        public Long getLongtitude() {
            return longtitude;
        }

        public void setLongtitude(Long longtitude) {
            this.longtitude = longtitude;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getValue() {
            return Value;
        }

        public void setValue(String value) {
            Value = value;
        }
    }
