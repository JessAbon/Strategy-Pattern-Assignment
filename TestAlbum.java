public class TestAlbum {

    public static void main(String[] args) {
        Album[] albums = {
                new Album("Hotel California", "Eagles", Album.Genre.ROCK),
                new Album("Best of", "J.S. Bach", Album.Genre.CLASSICAL),
                new Album("Arrival", "ABBA", Album.Genre.POP),
                new Album("Hemma hos 1", "Janne & Kjell", Album.Genre.OTHER),
                new Album("White album", "Beatles", Album.Genre.POP),
                new Album("Best of", "Mozart", Album.Genre.CLASSICAL),
                new Album("Thank you for the music", "ABBA", Album.Genre.POP)
        };
        printAlbums(albums);

        System.out.println("Without pop:");
        printWithoutPopAlbums(albums);

        System.out.println("And with only pop albums: ");
        printWithOnlyPopAlbums(albums);
    }


    static void printWithOnlyPopAlbums(Album[] albums) {
        GenreFilter onlyPopFilter = new OnlyPopFilter();
        for (Album a : albums) {
            if (onlyPopFilter.accept(a)) {
                System.out.println(a);
            }
        }
    }


    static void printWithoutPopAlbums(Album[] albums) {
        GenreFilter noPopFilter = new NoPopFilter();

        for (Album a : albums) {
            if (noPopFilter.accept(a)) {
                System.out.println(a);
            }
        }
    }

    static void printAlbums(Album[] albums) {
        for (Album a : albums) {
            System.out.println(a);
        }
    }
}
