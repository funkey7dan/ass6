// a ball remover is in charge of removing balls from the game, as well as keeping count
// of the number of blocks that remain.
public class BallAdder implements HitListener {
    private Game game;
    private Counter remainingBalls;

    public BallAdder(Game game, Counter remainingBalls) {
        this.game = game;
        this.remainingBalls = remainingBalls;
    }

    // Blocks that are hit should be removed
    // from the game. Remember to remove this listener from the block
    // that is being removed from the game.
    public void hitEvent(Block beingHit, Ball hitter) {
        hitter.spawnBall();
        remainingBalls.increase(1);
    }
}