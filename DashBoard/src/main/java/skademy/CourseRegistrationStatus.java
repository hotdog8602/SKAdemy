package skademy;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="CourseRegistrationStatus_table")
public class CourseRegistrationStatus {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long courseId;
        private Long lectureId;
        private String courseStatus;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Long getCourseId() {
            return courseId;
        }

        public void setCourseId(Long courseId) {
            this.courseId = courseId;
        }
        public Long getLectureId() {
            return lectureId;
        }

        public void setLectureId(Long lectureId) {
            this.lectureId = lectureId;
        }
        public String getCourseStatus() {
            return courseStatus;
        }

        public void setCourseStatus(String courseStatus) {
            this.courseStatus = courseStatus;
        }

}
