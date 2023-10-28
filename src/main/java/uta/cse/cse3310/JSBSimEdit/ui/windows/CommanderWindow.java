package uta.cse.cse3310.JSBSimEdit.ui.windows;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;
import uta.cse.cse3310.JSBSimEdit.ui.components.Aerodynamics;
import uta.cse.cse3310.JSBSimEdit.ui.components.Autopilot;
import uta.cse.cse3310.JSBSimEdit.ui.components.BuoyantForce;
import uta.cse.cse3310.JSBSimEdit.ui.components.ExternalReaction;
import uta.cse.cse3310.JSBSimEdit.ui.components.FlightControl;
import uta.cse.cse3310.JSBSimEdit.ui.components.GeneralInformation;
import uta.cse.cse3310.JSBSimEdit.ui.components.GroundReaction;
import uta.cse.cse3310.JSBSimEdit.ui.components.Input;
import uta.cse.cse3310.JSBSimEdit.ui.components.MassBalance;
import uta.cse.cse3310.JSBSimEdit.ui.components.Metrics;
import uta.cse.cse3310.JSBSimEdit.ui.components.Output;
import uta.cse.cse3310.JSBSimEdit.ui.components.Propulsion;
import uta.cse.cse3310.JSBSimEdit.ui.components.SystemProperties;

public class CommanderWindow extends JFrame {

  public CommanderWindow(String title) {
    super(title);
    this.setLocationByPlatform(true);
    this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    this.setSize(1100, 700);

    JToolBar toolbar = createToolbar();
    Container contentPane = this.getContentPane();
    contentPane.add(toolbar, BorderLayout.NORTH);

    JTabbedPane tabbedPane = createTabbedPane();
    add(tabbedPane, BorderLayout.CENTER);

    JLabel display = new JLabel();
    display.setFont(new Font("SansSerif", Font.BOLD, 17));
    add(display, BorderLayout.CENTER);

    setVisible(true);
  }

  protected void onNewClick() {
  }
  
  protected void onSaveClick() {
  }
  
  protected void onOpenClick() {}

  protected void onQuitClick() {
    dispose();
  }

  private List<JButton> createButtons() {
    JButton newFileButton = new JButton(new ImageIcon("src/main/java/uta/cse/cse3310/JSBSimEdit/resources/new-document.png"));
    newFileButton.setActionCommand("New File");
    newFileButton.setToolTipText("Create new file");
    newFileButton.addActionListener(event -> onNewClick());

    JButton openFileButton = new JButton(new ImageIcon("src/main/java/uta/cse/cse3310/JSBSimEdit/resources/folder.png"));
    openFileButton.setActionCommand("Open File");
    openFileButton.setToolTipText("Open an existing file");
    openFileButton.addActionListener(event -> onOpenClick());

    JButton saveFileButton = new JButton(new ImageIcon("src/main/java/uta/cse/cse3310/JSBSimEdit/resources/diskette.png"));
    saveFileButton.setActionCommand("Save File");
    saveFileButton.setToolTipText("Save an existing file");
    saveFileButton.addActionListener(event -> onSaveClick());

    JButton quitButton = new JButton(new ImageIcon("src/main/java/uta/cse/cse3310/JSBSimEdit/resources/reject.png"));
    quitButton.setActionCommand("Quit");
    quitButton.setToolTipText("Exit Window");
    quitButton.addActionListener(event -> onQuitClick());

    return List.of(
        newFileButton,
        openFileButton,
        saveFileButton,
        quitButton
    );
  }

  private JToolBar createToolbar() {
    JToolBar toolbar = new JToolBar("JSBSim Edit Controls");
    List<JButton> buttons = createButtons();
    buttons.forEach(toolbar::add);
    return toolbar;
  }

  private JTabbedPane createTabbedPane() {
    ExternalReaction externalReaction = new ExternalReaction();
    BuoyantForce buoyantForce = new BuoyantForce();
    Propulsion propulsion = new Propulsion();
    SystemProperties systemProperties = new SystemProperties();
    Metrics metrics = new Metrics();
    GroundReaction groundReact = new GroundReaction();
    MassBalance massBalance = new MassBalance();
    GeneralInformation generalInfo = new GeneralInformation();
    Aerodynamics aeroDynamics = new Aerodynamics();
    Autopilot autoPilot = new Autopilot();
    FlightControl flightControl = new FlightControl();
    Output output = new Output();
    Input input = new Input();

    JTabbedPane tabbedPane = new JTabbedPane();
    tabbedPane.addTab("general_info", generalInfo);
    tabbedPane.addTab("metrics", metrics);
    tabbedPane.addTab("mass_balance", massBalance);
    tabbedPane.addTab("ground_reactions", groundReact);
    tabbedPane.addTab("external_reactions", externalReaction);
    tabbedPane.addTab("propulsion", propulsion);
    tabbedPane.addTab("buoyant_forces", buoyantForce);
    tabbedPane.addTab("systemProperties", systemProperties);
    tabbedPane.addTab("flight_control", flightControl);
    tabbedPane.addTab("aerodynamics", aeroDynamics);
    tabbedPane.addTab("autoPilot", autoPilot);
    tabbedPane.addTab("input", input);
    tabbedPane.addTab("output", output);
    return tabbedPane;
  }
}
