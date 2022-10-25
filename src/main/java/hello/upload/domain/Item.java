package hello.upload.domain;


import lombok.Data;

@Data
public class Item {

    private Long id;
    private String itemName;
    private UploadFile attachFile;
}
