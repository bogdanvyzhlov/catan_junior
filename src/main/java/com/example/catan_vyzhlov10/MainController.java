package com.example.catan_vyzhlov10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static com.example.catan_vyzhlov10.Game.*;

public class MainController {
    Game game = new Game();
    @FXML
    void initialize(){
        kube.setImage(kube1);
    }


    @FXML
    private ImageView castleId0;

    @FXML
    private ImageView castleId1;

    @FXML
    private ImageView castleId2;
    @FXML
    private ImageView castleId3;
    @FXML
    private ImageView castleId4;
    @FXML
    private ImageView castleId5;
    @FXML
    private ImageView castleId6;
    @FXML
    private ImageView castleId7;
    @FXML
    private ImageView castleId8;
    @FXML
    private ImageView castleId9;
    @FXML
    private ImageView castleId10;
    @FXML
    private ImageView castleId11;
    @FXML
    private ImageView castleId12;
    @FXML
    private ImageView castleId13;
    @FXML
    private ImageView castleId14;
    @FXML
    private ImageView castleId15;
    @FXML
    private ImageView castleId16;
    @FXML
    private ImageView castleId17;
    @FXML
    private ImageView castleId18;
    @FXML
    private ImageView castleId19;
    @FXML
    private ImageView castleId20;
    @FXML
    private ImageView castleId21;
    @FXML
    private ImageView castleId22;
    @FXML
    private ImageView castleId23;
    @FXML
    private ImageView castleId24;
    @FXML
    private ImageView castleId25;
    @FXML
    private ImageView castleId26;
    @FXML
    private ImageView castleId27;
    @FXML
    private ImageView castleId28;
    @FXML
    private ImageView castleId29;
    @FXML
    private ImageView castleId30;
    @FXML
    private ImageView castleId31;

    @FXML
    private TextArea textMessage;


    @FXML
    private ImageView kube;

    @FXML
    private TextField textYellow;

    @FXML
    private TextField textBlue;

    @FXML
    void printBlue(MouseEvent event) {
      textBlue.setText(pl1.toString());
    }
    @FXML
    void printYellow(MouseEvent event) {
        textYellow.setText(pl2.toString());
    }

    FileInputStream inputStream1 = new FileInputStream("/Users/bogdanvyzlov/Desktop/catan_vyzhlov10/src/main/resources/com/example/catan_vyzhlov10/pictures/Kostka1.jpeg");
    Image kube1 = new Image(inputStream1);

    FileInputStream inputStream2 = new FileInputStream("/Users/bogdanvyzlov/Desktop/catan_vyzhlov10/src/main/resources/com/example/catan_vyzhlov10/pictures/Kostka2.jpeg");
    Image kube2 = new Image(inputStream2);

    FileInputStream inputStream3 = new FileInputStream("/Users/bogdanvyzlov/Desktop/catan_vyzhlov10/src/main/resources/com/example/catan_vyzhlov10/pictures/Kostka3.jpeg");
    Image kube3 = new Image(inputStream3);

    FileInputStream inputStream4 = new FileInputStream("/Users/bogdanvyzlov/Desktop/catan_vyzhlov10/src/main/resources/com/example/catan_vyzhlov10/pictures/Kostka4.jpeg");
    Image kube4 = new Image(inputStream4);

    FileInputStream inputStream5 = new FileInputStream("/Users/bogdanvyzlov/Desktop/catan_vyzhlov10/src/main/resources/com/example/catan_vyzhlov10/pictures/Kostka5.jpeg");
    Image kube5 = new Image(inputStream5);

    FileInputStream inputStream6 = new FileInputStream("/Users/bogdanvyzlov/Desktop/catan_vyzhlov10/src/main/resources/com/example/catan_vyzhlov10/pictures/Kostka6.jpeg");
    Image kube6 = new Image(inputStream6);


    FileInputStream inputStream7= new FileInputStream("/Users/bogdanvyzlov/Desktop/catan_vyzhlov10/src/main/resources/com/example/catan_vyzhlov10/pictures/Blue_town.png");
    Image blueCastle = new Image(inputStream7);


    FileInputStream inputStream8 = new FileInputStream("/Users/bogdanvyzlov/Desktop/catan_vyzhlov10/src/main/resources/com/example/catan_vyzhlov10/pictures/Yellow_town.png");
    Image yellowCastle = new Image(inputStream8);



    public MainController() throws FileNotFoundException {
    }


    @FXML
    void drawKube(MouseEvent event) {
        int a = (int)( Math.random()*6+1);
        giveResourses(a);
        textMessage.setText("Player "+curentPl.getColour()+" "+"ziskal suroviny z cisla "+a);
        if(a==1) {
            kube.setImage(kube1);
        }if(a==2) {

            kube.setImage(kube2);
        }if(a==3) {

            kube.setImage(kube3);
        }if(a==4) {

            kube.setImage(kube4);
        }if(a==5) {

            kube.setImage(kube5);
        }if(a==6) {

            kube.setImage(kube6);
        }
    }

    @FXML
    void clickCard0(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId0.setImage(blueCastle);
        curentPl.setPocetWood(curentPl.getPocetWood()-1);
        curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
        curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId0.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard1(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId1.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId1.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard2(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId2.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId2.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard3(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId3.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId3.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard4(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId4.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId4.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard5(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId5.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId5.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard6(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId6.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId6.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard7(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId7.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId7.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard8(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId8.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId8.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard9(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId9.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId9.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard10(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId10.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId10.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard11(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId11.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId11.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard12(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId12.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId12.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard13(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId13.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId13.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard14(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId14.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId14.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard15(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId15.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId15.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard16(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId16.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId16.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard17(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId17.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId17.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard18(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId18.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId18.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard19(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId19.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId19.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard20(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId20.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId20.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard21(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId21.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId21.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard22(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId22.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId22.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard23(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId23.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId23.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard24(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId24.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId24.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard25(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId25.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId25.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard26(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId26.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId26.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard27(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId27.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId27.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard28(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId28.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId28.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard29(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId29.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId29.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard30(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId30.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId30.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }
    @FXML
    void clickCard31(MouseEvent event){
        if(curentPl.getPocetWood()<1 && curentPl.getPocetMillet()<1){
            textMessage.setText("Player "+curentPl.getColour()+" "+"is lose");
        }
        if(curentPl.getColour()=="Blue"){
            castleId31.setImage(blueCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        if(curentPl.getColour()=="Yellow"){
            castleId31.setImage(yellowCastle);
            curentPl.setPocetWood(curentPl.getPocetWood()-1);
            curentPl.setPocetMillet(curentPl.getPocetMillet()-1);
            curentPl.setPocetBodu(curentPl.getPocetBodu()+1);
        }
        changeCurrentPlayer();
        textMessage.setText("Chod hrace "+curentPl.getColour()+" "+"stiskni kostky");
    }




}
