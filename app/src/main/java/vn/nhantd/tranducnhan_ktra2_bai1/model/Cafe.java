package vn.nhantd.tranducnhan_ktra2_bai1.model;

/**
 * Created by Tran Duc Nhan on 2021-05-14
 */
public class Cafe {
    private int img;
    private String Title;

    public Cafe(int img, String title) {
        this.img = img;
        Title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "img=" + img +
                ", Title='" + Title + '\'' +
                '}';
    }
}

