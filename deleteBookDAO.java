import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteBookDAO {
    public static void deleteBook(int bookId) {
        String sql = "DELETE FROM books WHERE id = ?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, bookId);
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Book deleted successfully!");
            } else {
                System.out.println("Book with ID " + bookId + " not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        deleteBook(1); // Example: Deleting book with ID 1
    }
}
