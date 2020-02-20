package homeWorks.oop1;

public class Runner {
    public static void main(String[] args) {
        Photo photo1 = new Photo("чилим");
        Photo photo2 = new Photo("пампарам");

        Page page1 = new Page();
        page1.getPhotos().add(photo1);
        page1.getPhotos().add(photo2);

        Album myAlbum = new Album();

        myAlbum.getPages().add(page1);

        Photo newPhoto = new Photo("3");
        myAlbum.addPhoto(newPhoto);

        System.out.println("\nКол-во фоток: " + myAlbum.getPhotosCount());
        myAlbum.getPhotosInfo();
    }
}
