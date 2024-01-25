public class NoPopFilter implements GenreFilter{

    @Override
    public boolean accept(Album album) {
        return (!album.genre().equalsIgnoreCase("Pop"));
    }
    
}
