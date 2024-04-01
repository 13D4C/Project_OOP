public interface AddAble {
    void addName(String name);
    void addPassword(String password);
    void addPassword(int password);

    // เพิ่มเมธอดที่รับค่า
    default void addUserInfo(String name, String password) {
        addName(name);
        addPassword(password);
    }
}
