package practice10;

public interface KlassObserver {
    void updateNewStudentJoinedClass(String studentName, Integer classNumber);

    void updateNewLeaderForClass(String studentName, Integer classNumber);
}
