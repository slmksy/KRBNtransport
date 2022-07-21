package com.krbn.ui;

import com.krbn.cargo.KbrnCargo;
import com.krbn.cargo.visitor.CargoCostVisitor;
import com.krbn.material.*;
import com.krbn.material.visitor.MatterialCostVisitor;
import com.krbn.transport.*;
import com.krbn.transport.visitor.TransportCostVisitor;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.util.StringConverter;

public class KrbnUIController {
    @FXML
    private Label lblTotalCost;
    @FXML
    private Label lblTotalTime;
    @FXML
    private TextField txtWeight;
    @FXML
    private TextField txtDistance;

    @FXML
    private ComboBox<String> cmbMaterialType;
    @FXML
    private ComboBox<String> cmbTransportType;

    private TransportCostVisitor transportCostVisitor = new TransportCostVisitor();
    private  MatterialCostVisitor matterialCostVisitor = new MatterialCostVisitor();
    private CargoCostVisitor cargoCostVisitor = new CargoCostVisitor();



    @FXML
    public void btnCalcOnClick(MouseEvent event) {
        KbrnCargo kbrnCargo = new KbrnCargo(getSelectedMaterial(), getSelectedTransport());
        kbrnCargo.visit(cargoCostVisitor);

        lblTotalCost.setText(String.valueOf(kbrnCargo.getCargoCost()));
        lblTotalTime.setText(String.valueOf(kbrnCargo.getTransportTime()));



    }

    private double getWeight(){
        try {
            var weight = Integer.parseInt(txtWeight.getText());
            return  weight;
        }
        catch (Exception ex){
            System.console().writer().println(ex.toString());
            return 0;
        }
    }

    private double getDistance(){
        try {
            var distance = Integer.parseInt(txtDistance.getText());
            return distance;
        }
        catch (Exception ex){
            System.console().writer().println(ex.toString());
            return 0;
        }
    }

    private BaseTransportVehicle getSelectedTransport(){
        switch ((String)cmbTransportType.getValue()){
            case "Uçak":
                AirVehicle airVehicle = new AirVehicle();
                airVehicle.setLoadWeight(getWeight());
                airVehicle.visit(transportCostVisitor);
                airVehicle.move(getDistance());
                return  airVehicle;
            case "Kara":
                LandVehicle landVehicle =  new LandVehicle();
                landVehicle.setLoadWeight(getWeight());
                landVehicle.visit(transportCostVisitor);
                landVehicle.move(getDistance());
            return  landVehicle;
            case "Gemi":
                ShipVehicle shipVehicle = new ShipVehicle();
                shipVehicle.setLoadWeight(getWeight());
                shipVehicle.visit(transportCostVisitor);
                shipVehicle.move(getDistance());
            return  shipVehicle;
            case "Tren":
                TrainVehicle trainVehicle = new TrainVehicle();
                trainVehicle.setLoadWeight(getWeight());
                trainVehicle.visit(transportCostVisitor);
                trainVehicle.move(getDistance());
            return  trainVehicle;

            default:
                return null;
        }
    }

    private BaseCriticalMaterial getSelectedMaterial(){
        switch ((String)cmbMaterialType.getValue()){
            case "K":
                ChemicalMaterial chemicalMaterial = new ChemicalMaterial();
                chemicalMaterial.setWeight(getWeight());
                chemicalMaterial.visit(matterialCostVisitor);
                return  chemicalMaterial;
            case "R":
                RadiologicMaterial radiologicMaterial = new RadiologicMaterial();
                radiologicMaterial.setWeight(getWeight());
                radiologicMaterial.visit(matterialCostVisitor);
                return  radiologicMaterial;
            case "B":
                BiologicMaterial biologicMaterial1 = new BiologicMaterial();
                biologicMaterial1.setWeight(getWeight());
                biologicMaterial1.visit(matterialCostVisitor);
                return  biologicMaterial1;
            case "N":
                NuclearMaterial nuclearMaterial1 = new NuclearMaterial();
                nuclearMaterial1.setWeight(getWeight());
                nuclearMaterial1.visit(matterialCostVisitor);
                return  nuclearMaterial1;

            default:
                return null;
        }
    }
}