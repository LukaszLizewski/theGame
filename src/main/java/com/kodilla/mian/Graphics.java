package com.kodilla.mian;

import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Graphics {

    private Logic logic;
    private Stage primaryStage;
    private FlowPane stackPane;
    private GridPane gridWorkshopOne;
    private GridPane gridWorkshopTwo;
    private GridPane gridWorkshopThree;
    private GridPane gridWorkshopFour;
    private GridPane gridWorkshopFive;
    private GridPane gridLastWorkshop;
    private GridPane gridScorePlayer;
    private GridPane gridScoreComputer;
    private GridPane puzzleOfRowsPlayer;
    private GridPane puzzleOfRowsComputer;
    private GridPane puzzlePlayer;
    private GridPane puzzleComputer;
    private GridPane penaltyPointsPlayer;
    private GridPane penaltyPointsComputer;
    private Image imageBackground = new Image("file:src/main/resources/board.jpg");
    private Image imageBlueIcon = new Image("file:src/main/resources/blue.jpg");
    private Image imageBlackIcon = new Image("file:src/main/resources/black.jpg");
    private Image imageRedIcon = new Image("file:src/main/resources/red.jpg");
    private Image imageWhiteIcon = new Image("file:src/main/resources/white.jpg");
    private Image imageYellowIcon = new Image("file:src/main/resources/yellow.jpg");
    private Image imageOneIcon = new Image("file:src/main/resources/one.jpg");

    public void board (Stage primaryStage) throws Exception{

        BackgroundSize backgroundSize = new BackgroundSize(100.0,100.0, false,false,true,false);
        BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane gridWorkshopOne = new GridPane();
        for (int i =0;i<2;i++) {
            gridWorkshopOne.getColumnConstraints().add(new ColumnConstraints(50));
            gridWorkshopOne.addColumn(i);
            gridWorkshopOne.getRowConstraints().add(new RowConstraints(50));
            gridWorkshopOne.addRow(i);
        }
        gridWorkshopOne.setAlignment(Pos.TOP_LEFT);
        gridWorkshopOne.setGridLinesVisible(true);
        gridWorkshopOne.setPadding(new Insets(50,0,0,90));
        gridWorkshopOne.setHgap(10.0);
        gridWorkshopOne.setVgap(10.0);

        GridPane gridWorkshopTwo = new GridPane();
        for (int i =0;i<2;i++) {
            gridWorkshopTwo.getColumnConstraints().add(new ColumnConstraints(50));
            gridWorkshopTwo.addColumn(i);
            gridWorkshopTwo.getRowConstraints().add(new RowConstraints(50));
            gridWorkshopTwo.addRow(i);
        }
        gridWorkshopTwo.setAlignment(Pos.TOP_LEFT);
        gridWorkshopTwo.setGridLinesVisible(true);
        gridWorkshopTwo.setPadding(new Insets(50,0,0,90));
        gridWorkshopTwo.setHgap(10.0);
        gridWorkshopTwo.setVgap(10.0);

        GridPane gridWorkshopThree = new GridPane();
        for (int i =0;i<2;i++) {
            gridWorkshopThree.getColumnConstraints().add(new ColumnConstraints(50));
            gridWorkshopThree.addColumn(i);
            gridWorkshopThree.getRowConstraints().add(new RowConstraints(50));
            gridWorkshopThree.addRow(i);
        }
        gridWorkshopThree.setAlignment(Pos.TOP_LEFT);
        gridWorkshopThree.setGridLinesVisible(true);
        gridWorkshopThree.setPadding(new Insets(50,0,0,90));
        gridWorkshopThree.setHgap(10.0);
        gridWorkshopThree.setVgap(10.0);

        GridPane gridWorkshopFour = new GridPane();
        for (int i =0;i<2;i++) {
            gridWorkshopFour.getColumnConstraints().add(new ColumnConstraints(50));
            gridWorkshopFour.addColumn(i);
            gridWorkshopFour.getRowConstraints().add(new RowConstraints(50));
            gridWorkshopFour.addRow(i);
        }
        gridWorkshopFour.setAlignment(Pos.TOP_LEFT);
        gridWorkshopFour.setGridLinesVisible(true);
        gridWorkshopFour.setPadding(new Insets(50,0,0,90));
        gridWorkshopFour.setHgap(10.0);
        gridWorkshopFour.setVgap(10.0);

        GridPane gridWorkshopFive = new GridPane();
        for (int i =0;i<2;i++) {
            gridWorkshopFive.getColumnConstraints().add(new ColumnConstraints(50));
            gridWorkshopFive.addColumn(i);
            gridWorkshopFive.getRowConstraints().add(new RowConstraints(50));
            gridWorkshopFive.addRow(i);
        }
        gridWorkshopFive.setAlignment(Pos.TOP_LEFT);
        gridWorkshopFive.setGridLinesVisible(true);
        gridWorkshopFive.setPadding(new Insets(50,81,0,90));
        gridWorkshopFive.setHgap(10.0);
        gridWorkshopFive.setVgap(10.0);

        GridPane gridLastWorkshop = new GridPane();
        for (int i =0;i<16;i++) {
            gridLastWorkshop.getColumnConstraints().add(new ColumnConstraints(50));
            gridLastWorkshop.addColumn(i);
            }
        gridLastWorkshop.getRowConstraints().add(new RowConstraints(50));
        gridLastWorkshop.addRow(0);
        gridLastWorkshop.setAlignment(Pos.TOP_LEFT);
        gridLastWorkshop.setGridLinesVisible(true);
        gridLastWorkshop.setPadding(new Insets(20,0,0,0));
        gridLastWorkshop.setHgap(10.0);
        gridLastWorkshop.setVgap(10.0);





        /*GridPane gridLastWorkshop = new GridPane();
        gridLastWorkshop.setAlignment(Pos.TOP_CENTER);
        gridLastWorkshop.setGridLinesVisible(true);
        gridLastWorkshop.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
        gridLastWorkshop.setPadding(new Insets(20,10.0,10.0,20));
        gridLastWorkshop.setPrefSize(50.0,50.0);
        gridLastWorkshop.setHgap(10.0);
        gridLastWorkshop.setVgap(10.0);*/







        GridPane gridScorePlayer = new GridPane();
        gridScorePlayer.setAlignment(Pos.TOP_LEFT);
        gridScorePlayer.setGridLinesVisible(true);
        gridScorePlayer.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
        gridScorePlayer.setPadding(new Insets(258,0,0,22));
        gridScorePlayer.setHgap(17.0);
        gridScorePlayer.setVgap(20.0);

        GridPane gridScoreComputer = new GridPane();
        gridScoreComputer.setAlignment(Pos.TOP_LEFT);
        gridScoreComputer.setGridLinesVisible(true);
        gridScoreComputer.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
        gridScoreComputer.setPadding(new Insets(257,10.0,10.0,725.0));
        gridScoreComputer.setHgap(17.0);
        gridScoreComputer.setVgap(20.0);

        GridPane puzzleOfRowsPlayer = new GridPane();
        for (int i =0;i<5;i++) {
            puzzleOfRowsPlayer.getColumnConstraints().add(new ColumnConstraints(31));
            puzzleOfRowsPlayer.addColumn(i);
            puzzleOfRowsPlayer.getRowConstraints().add(new RowConstraints(31));
            puzzleOfRowsPlayer.addRow(i);
        }
        puzzleOfRowsPlayer.setAlignment(Pos.BOTTOM_LEFT);
        puzzleOfRowsPlayer.setGridLinesVisible(true);
        puzzleOfRowsPlayer.setPadding(new Insets(50,50,80,20));
        puzzleOfRowsPlayer.setHgap(2.0);
        puzzleOfRowsPlayer.setVgap(2.0);

        GridPane puzzlePlayer = new GridPane();
        for (int i =0;i<5;i++) {
            puzzlePlayer.getColumnConstraints().add(new ColumnConstraints(31));
            puzzlePlayer.addColumn(i);
            puzzlePlayer.getRowConstraints().add(new RowConstraints(31));
            puzzlePlayer.addRow(i);
        }
        puzzlePlayer.setAlignment(Pos.BOTTOM_LEFT);
        puzzlePlayer.setGridLinesVisible(true);
        puzzlePlayer.setPadding(new Insets(50,50,80,200));
        puzzlePlayer.setHgap(2.0);
        puzzlePlayer.setVgap(2.0);

        GridPane penaltyPointsPlayer = new GridPane();
        for (int i =0;i<7;i++) {
            penaltyPointsPlayer.getColumnConstraints().add(new ColumnConstraints(31));
            penaltyPointsPlayer.addColumn(i);
        }
        penaltyPointsPlayer.getRowConstraints().add(new RowConstraints(31));
        penaltyPointsPlayer.addRow(0);
        penaltyPointsPlayer.setAlignment(Pos.BOTTOM_LEFT);
        penaltyPointsPlayer.setGridLinesVisible(true);
        penaltyPointsPlayer.setPadding(new Insets(50,50,22,18));
        penaltyPointsPlayer.setHgap(5.0);
        penaltyPointsPlayer.setVgap(5.0);

        GridPane puzzleOfRowsComputer = new GridPane();
        for (int i =0;i<5;i++) {
            puzzleOfRowsComputer.getColumnConstraints().add(new ColumnConstraints(31));
            puzzleOfRowsComputer.addColumn(i);
            puzzleOfRowsComputer.getRowConstraints().add(new RowConstraints(31));
            puzzleOfRowsComputer.addRow(i);
        }
        puzzleOfRowsComputer.setAlignment(Pos.BOTTOM_RIGHT);
        puzzleOfRowsComputer.setGridLinesVisible(true);
        puzzleOfRowsComputer.setPadding(new Insets(50,197,81,50));
        puzzleOfRowsComputer.setHgap(2.0);
        puzzleOfRowsComputer.setVgap(2.0);

        GridPane puzzleComputer = new GridPane();
        for (int i =0;i<5;i++) {
            puzzleComputer.getColumnConstraints().add(new ColumnConstraints(31));
            puzzleComputer.addColumn(i);
            puzzleComputer.getRowConstraints().add(new RowConstraints(31));
            puzzleComputer.addRow(i);
        }
        puzzleComputer.setAlignment(Pos.BOTTOM_RIGHT);
        puzzleComputer.setGridLinesVisible(true);
        puzzleComputer.setPadding(new Insets(50,15,81,50));
        puzzleComputer.setHgap(2.0);
        puzzleComputer.setVgap(2.0);

        GridPane penaltyPointsComputer = new GridPane();
        for (int i =0;i<7;i++) {
            penaltyPointsComputer.getColumnConstraints().add(new ColumnConstraints(31));
            penaltyPointsComputer.addColumn(i);
        }
        penaltyPointsComputer.getRowConstraints().add(new RowConstraints(31));
        penaltyPointsComputer.addRow(0);
        penaltyPointsComputer.setAlignment(Pos.BOTTOM_RIGHT);
        penaltyPointsComputer.setGridLinesVisible(true);
        penaltyPointsComputer.setPadding(new Insets(50,113,23,20));
        penaltyPointsComputer.setHgap(5.0);
        penaltyPointsComputer.setVgap(5.0);

        FlowPane flowPane = new FlowPane();
        flowPane.setBackground(background);
        flowPane.setOrientation(Orientation.HORIZONTAL);
        flowPane.setAlignment(Pos.TOP_CENTER);



        flowPane.getChildren().addAll(gridWorkshopOne);
        flowPane.getChildren().add(gridWorkshopTwo);
        flowPane.getChildren().add(gridWorkshopThree);
        flowPane.getChildren().add(gridWorkshopFour);
        flowPane.getChildren().add(gridWorkshopFive);
        flowPane.getChildren().add(gridLastWorkshop);
//        flowPane.getChildren().add(gridScorePlayer);
//        flowPane.getChildren().add(gridScoreComputer);
//        flowPane.getChildren().add(puzzleOfRowsPlayer);
//        flowPane.getChildren().add(puzzleOfRowsComputer);
//        flowPane.getChildren().add(puzzlePlayer);
//        flowPane.getChildren().add(puzzleComputer);
//        flowPane.getChildren().add(penaltyPointsPlayer);
//        flowPane.getChildren().add(penaltyPointsComputer);

        Scene scene = new Scene(flowPane, 153*7, 89*7, Color.color(0.6,0.6,0.6));

        primaryStage.setTitle("Azul");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        this.primaryStage = primaryStage;
        this.stackPane = flowPane;
        this.gridWorkshopOne = gridWorkshopOne;
        this.gridWorkshopTwo = gridWorkshopTwo;
        this.gridWorkshopThree = gridWorkshopThree;
        this.gridWorkshopFour = gridWorkshopFour;
        this.gridWorkshopFive = gridWorkshopFive;
        this.gridLastWorkshop = gridLastWorkshop;
        this.gridScorePlayer = gridScorePlayer;
        this.gridScoreComputer = gridScoreComputer;
        this.puzzleOfRowsPlayer = puzzleOfRowsPlayer;
        this.puzzleOfRowsComputer = puzzleOfRowsComputer;
        this.puzzlePlayer = puzzlePlayer;
        this.puzzlePlayer = puzzleComputer;
        this.penaltyPointsPlayer = penaltyPointsPlayer;
        this.penaltyPointsComputer = penaltyPointsComputer;
    }
    private Image tempImage;
    private GridPane tempGrid;
    public void workshop (int a, int b, int c, int d, int number) throws Exception {
        if (number==1){
            tempGrid = gridWorkshopOne;
        } else if (number==2){
            tempGrid = gridWorkshopTwo;
        } else if (number==3){
            tempGrid = gridWorkshopThree;
        } else if (number==4){
            tempGrid = gridWorkshopFour;
        } else if (number==5){
            tempGrid = gridWorkshopFive;
        }
        if (a==0) {
            tempImage = imageRedIcon;
        } else if (a==1) {
            tempImage = imageBlueIcon;
        } else if (a==2) {
            tempImage = imageBlackIcon;
        } else if (a==3) {
            tempImage = imageWhiteIcon;
        } else if (a==4) {
            tempImage = imageYellowIcon;
        }
        ImageView firstIcon = new ImageView(tempImage);
        firstIcon.setFitHeight(50.0);
        firstIcon.setFitWidth(50.0);
        firstIcon.setOnMouseClicked(event -> {
            try {
                logic.addToList(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        GridPane.setRowIndex(firstIcon, 0);
        GridPane.setColumnIndex(firstIcon, 0);
        tempGrid.getChildren().add(firstIcon);
        if (b==0) {
            tempImage = imageRedIcon;
        } else if (b==1) {
            tempImage = imageBlueIcon;
        } else if (b==2) {
            tempImage = imageBlackIcon;
        } else if (b==3) {
            tempImage = imageWhiteIcon;
        } else if (b==4) {
            tempImage = imageYellowIcon;
        }
        ImageView secondIcon = new ImageView(tempImage);
        secondIcon.setFitHeight(50.0);
        secondIcon.setFitWidth(50.0);
        secondIcon.setOnMouseClicked(event -> System.out.println("klik 2"));
        GridPane.setRowIndex(secondIcon, 1);
        GridPane.setColumnIndex(secondIcon, 0);
        tempGrid.getChildren().add(secondIcon);
        if (c==0) {
            tempImage = imageRedIcon;
        } else if (c==1) {
            tempImage = imageBlueIcon;
        } else if (c==2) {
            tempImage = imageBlackIcon;
        } else if (c==3) {
            tempImage = imageWhiteIcon;
        } else if (c==4) {
            tempImage = imageYellowIcon;
        }
        ImageView thirdIcon = new ImageView(tempImage);
        thirdIcon.setFitHeight(50.0);
        thirdIcon.setFitWidth(50.0);
        thirdIcon.setOnMouseClicked(event -> System.out.println("klik 3"));
        GridPane.setRowIndex(thirdIcon, 0);
        GridPane.setColumnIndex(thirdIcon, 1);
        tempGrid.getChildren().add(thirdIcon);
        if (d==0) {
            tempImage = imageRedIcon;
        } else if (d==1) {
            tempImage = imageBlueIcon;
        } else if (d==2) {
            tempImage = imageBlackIcon;
        } else if (d==3) {
            tempImage = imageWhiteIcon;
        } else if (d==4) {
            tempImage = imageYellowIcon;
        }
        ImageView fourthIcon = new ImageView(tempImage);
        fourthIcon.setFitHeight(50.0);
        fourthIcon.setFitWidth(50.0);
        fourthIcon.setOnMouseClicked(event -> System.out.println("klik 4"));
        GridPane.setRowIndex(fourthIcon, 1);
        GridPane.setColumnIndex(fourthIcon, 1);
        tempGrid.getChildren().add(fourthIcon);
    }
    public void lastWorkshops (int...i) throws Exception {

        ImageView oneIcon = new ImageView(imageOneIcon);
        oneIcon.setFitHeight(50.0);
        oneIcon.setFitWidth(50.0);
        ImageView redIcon = new ImageView(imageRedIcon);
        redIcon.setFitHeight(50.0);
        redIcon.setFitWidth(50.0);
        ImageView blueIcon = new ImageView(imageBlueIcon);
        blueIcon.setFitHeight(50.0);
        blueIcon.setFitWidth(50.0);
        ImageView blackIcon = new ImageView(imageBlackIcon);
        blackIcon.setFitHeight(50.0);
        blackIcon.setFitWidth(50.0);
        ImageView whiteIcon = new ImageView(imageWhiteIcon);
        whiteIcon.setFitHeight(50.0);
        whiteIcon.setFitWidth(50.0);
        ImageView yellowIcon = new ImageView(imageYellowIcon);
        yellowIcon.setFitHeight(50.0);
        yellowIcon.setFitWidth(50.0);

        gridLastWorkshop.add(oneIcon, 0,0,1,1);
        if (i[1]>=1) {
            gridLastWorkshop.add(redIcon, 1, 0, 1, 1);
            gridLastWorkshop.add(blueIcon, 2, 0, 1, 1);
            gridLastWorkshop.add(blackIcon, 3, 0, 1, 1);
            gridLastWorkshop.add(whiteIcon, 4, 0, 1, 1);
            gridLastWorkshop.add(yellowIcon, 5, 0, 1, 1);
        }
//        gridLastWorkshop.add(oneIcon,1,0,1,1);
//        gridLastWorkshop.add(oneIcon,1,0,1,1);
    }
    public void scorePlayer (int a) throws Exception {
        ImageView scorePlayer = new ImageView(imageRedIcon);
        scorePlayer.setFitHeight(15.5);
        scorePlayer.setFitWidth(15.5);
        scorePlayer.setOpacity(0.9);

        if (a==0)
            gridScorePlayer.add(scorePlayer,0,0,1,1);
        if (a>=1 && a<=20)
            gridScorePlayer.add(scorePlayer, (a-1), 1,1,1);
        if (a>=21 && a<=40)
            gridScorePlayer.add(scorePlayer, (a-21), 2,1,1);
        if (a>=41 && a<=60)
            gridScorePlayer.add(scorePlayer, (a-41), 3,1,1);
        if (a>=61 && a<=80)
            gridScorePlayer.add(scorePlayer, (a-61), 4,1,1);
        if (a>=81 && a<=100)
            gridScorePlayer.add(scorePlayer, (a-81), 5,1,1);
    }
    public void scoreComputer (int a) throws Exception {
        ImageView scorePlayer = new ImageView(imageBlueIcon);
        scorePlayer.setFitHeight(15.5);
        scorePlayer.setFitWidth(15.5);
        scorePlayer.setOpacity(0.9);
        if (a==0)
            gridScoreComputer.add(scorePlayer,0,0,1,1);
        if (a>=1 && a<=20)
            gridScoreComputer.add(scorePlayer, (a-1), 1,1,1);
        if (a>=21 && a<=40)
            gridScoreComputer.add(scorePlayer, (a-21), 2,1,1);
        if (a>=41 && a<=60)
            gridScoreComputer.add(scorePlayer, (a-41), 3,1,1);
        if (a>=61 && a<=80)
            gridScoreComputer.add(scorePlayer, (a-61), 4,1,1);
        if (a>=81 && a<=100)
            gridScoreComputer.add(scorePlayer, (a-81), 5,1,1);
    }
    public void puzzleOfRowsPlayer () throws Exception {
        ImageView redIcon = new ImageView(imageRedIcon);
        redIcon.setFitHeight(31.0);
        redIcon.setFitWidth(31.0);
        ImageView blueIcon = new ImageView(imageBlueIcon);
        blueIcon.setFitHeight(31.0);
        blueIcon.setFitWidth(31.0);
        ImageView blackIcon = new ImageView(imageBlackIcon);
        blackIcon.setFitHeight(31.0);
        blackIcon.setFitWidth(31.0);
        ImageView whiteIcon = new ImageView(imageWhiteIcon);
        whiteIcon.setFitHeight(31.0);
        whiteIcon.setFitWidth(31.0);
        ImageView yellowIcon = new ImageView(imageYellowIcon);
        yellowIcon.setFitHeight(31.0);
        yellowIcon.setFitWidth(31.0);
        puzzleOfRowsPlayer.add(redIcon,4,0,1,1);
    }
    public void puzzleOfRowsComputer () throws Exception {
        ImageView redIcon = new ImageView(imageRedIcon);
        redIcon.setFitHeight(31.0);
        redIcon.setFitWidth(31.0);
        ImageView blueIcon = new ImageView(imageBlueIcon);
        blueIcon.setFitHeight(31.0);
        blueIcon.setFitWidth(31.0);
        ImageView blackIcon = new ImageView(imageBlackIcon);
        blackIcon.setFitHeight(31.0);
        blackIcon.setFitWidth(31.0);
        ImageView whiteIcon = new ImageView(imageWhiteIcon);
        whiteIcon.setFitHeight(31.0);
        whiteIcon.setFitWidth(31.0);
        ImageView yellowIcon = new ImageView(imageYellowIcon);
        yellowIcon.setFitHeight(31.0);
        yellowIcon.setFitWidth(31.0);
        puzzleOfRowsComputer.add(yellowIcon,4,0,1,1);
    }
}
