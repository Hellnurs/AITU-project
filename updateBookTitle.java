import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateBookTitle {
    public static void updateBookTitle(int bookId, String newTitle) {
        String sql = "UPDATE books SET title = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newTitle);
            pstmt.setInt(2, bookId);
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Book title updated successfully!");
            } else {
                System.out.println("Book with ID " + bookId + " not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        updateBookTitle(1, "Жаңа Java Бағдарламалау"); // Example: Updating book ID 1
    }
}
