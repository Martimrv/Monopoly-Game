package monopoly;
 
/**
 * ComputerPlayer class implements Player.
 * I could and should extend Player class but I was afraid of not being capable of building.
 */

public class ComputerPlayer implements Player {
  private Tile currentTile;
  private String name;
  private int funds;
  private ConsoleUi ui;

  /**
   * Computer Player constructor with startingTile, name and UI.
   *
   * @param startTile
   *
   * @param name
   *
   * @param ui
   *
   */
  @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = "EI_EXPOSE_REP2", 
        justification = "The tile objects are shared between all player and the board.")
  public ComputerPlayer(Tile startTile, String name, ConsoleUi ui) {
    this.name = name;
    this.currentTile = startTile;
    currentTile.stoppedOn(this);
    funds = 500;
    this.ui = ui;
  }

  /**
   * Return funds.
   */

  public int getFunds() {
    return funds;
  }

  /**
   * Returns player´s name.
   */
  public String getName() {
    return name;
  }

  /**
   * Moves the player and visits thisTile.
   *
   * @param steps
   *
   */
  private void move(int steps) {
    currentTile.startOn(this);
    for (int i = 0; i < steps; i++) {
      currentTile.visit(this);
      currentTile = currentTile.getNext();
    }
    currentTile.stoppedOn(this);
  }

  /**
   * Players turn interaction.
   */
  public boolean yourTurn(Dice d1, Dice d2) {
    int roll = 0;

    // Roll the dice until we get a non-zero value on each die
    d1.roll();
    d2.roll();
  
    roll = d1.getValue() + d2.getValue();

    // If even number, buy the current tile if we have enough funds
    if (roll % 2 == 0) {
      currentTile.buy(this);
      return false;
    } else { // If odd number, pay rent if the tile is owned by someone else
      d1.roll();
      d2.roll();
      ui.playerMoves(getName(), d1.getValue(), d2.getValue());
      move(d1.getValue() + d2.getValue());
      return true;
    }
  }

  /**
   * Pay the rent of that specific tile.
   */
  public int payRent(int amount) {
    if (funds < amount) {
      amount = funds;
    }
    funds -= amount;

    return amount;
  }

  /**
   * Deduce funds when needed (buying or renting).
   */
  public boolean deduceFunds(int cost) {
    if (funds > cost) {
      funds -= cost;

      return true;
    } else {
      return false;
    }
  }

  /**
   * Adding funds when needed(owns the tile or passing the startTile).
   */
  public void addFunds(int amount) {
    funds += amount;
  }

  /**
   * Returns the current Tile.
   */
  public Tile getCurrentTile() {
    return currentTile;
  }
}
