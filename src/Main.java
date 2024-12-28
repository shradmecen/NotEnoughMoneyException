public class Main {
    public static void main(String[] args) {
        Account account = new Account("Jan Kowalski", 1000, "PL123456789");

        try {
            // Próbujemy wykonać przelew większy niż dostępne środki
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Błąd: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Wystąpił nieoczekiwany błąd: " + e.getMessage());
        } finally {
            System.out.println("Aktualny stan konta: " + account.getBalance());
        }
    }
}
