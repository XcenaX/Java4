package homeWorks.oop1;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public int getPhotosCount(){
        int totalPhotos = 0;
        for(Page page : this.pages){
            totalPhotos += page.getPhotos().size();
        }

        return totalPhotos;
    }    

    public void addPhoto(Photo photo){
        pages.get(pages.size() - 1).getPhotos().add(photo);
    }

    public void changePhotoName(String oldName, String newName){
        for (Page page : this.pages){
            for(Photo photo : page.getPhotos()){
                if(photo.getName().equals(oldName)){
                    photo.setName(newName);
                    break;
                }
            }
        }
    }    

    public void getPhotosInfo(){
        for(Page page : this.pages){
            for(Photo photo : page.getPhotos()){
                System.out.println(photo);
            }
        }
    }
}
