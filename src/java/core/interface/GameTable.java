public interface GameTable {
	public int size();
	
	public boolean isFull();

	public boolean isEmpty();

	public boolean isStarted();

	public boolean isEnded();

	public boolean start();

	public boolean terminate();

	public GameStatus getStatus();

	public GameStatus getPlayerStatus(Player p);
}
