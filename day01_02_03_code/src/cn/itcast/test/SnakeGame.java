package cn.itcast.test;
/*
这玩意用不了
用AI写的
过一阵有时间了查查API用法自己手写一个吧
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int GRID_SIZE = 20;
    private static final int GAME_UNITS = (WIDTH / GRID_SIZE) - 1;
    private static final Color LIGHT_GREEN = Color.green;

    // Game states
    private enum GameState { MENU, PLAYING, GAME_OVER }

    // Directions
    private enum Direction { UP, DOWN, LEFT, RIGHT }

    // Snake and food positions
    private int[] snakeX;
    private int[] snakeY;

    // Current direction of the snake
    private Direction currentDirection = Direction.RIGHT;

    // Food position
    private int foodX;
    private int foodY;

    // Game variables
    private boolean gameOver = false;
    private boolean gameStarted = false;
    private int score = 0;
    private Timer timer;
    private Random random;

    // Constructor
    public SnakeGame() {
        init();
        setupGame();
    }

    // Initialize the game components
    private void init() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        random = new Random();

        // Set up timer for game updates (10 frames per second)
        timer = new Timer(100, this);

        // Add key listener
        addKeyListener(this);

        // Initial snake positions and direction
        snakeX = new int[GAME_UNITS];
        snakeY = new int[GAME_UNITS];
    }

    // Set up the game board
    private void setupGame() {
        for (int i = 0; i < GAME_UNITS; i++) {
            snakeX[i] = 0;
            snakeY[i] = 0;
        }

        currentDirection = Direction.RIGHT;
        score = 0;
        gameOver = false;
        gameStarted = true;

        // Generate initial food position
        generateFood();
    }

    // Start the game from menu state
    private void startGame() {
        if (gameOver) {
            resetGame();
        }

        gameState = GameState.PLAYING;
        repaint();
    }

    // Reset the game to initial state
    private void resetGame() {
        for (int i = 0; i < GAME_UNITS; i++) {
            snakeX[i] = 0;
            snakeY[i] = 0;
        }

        currentDirection = Direction.RIGHT;
        score = 0;
        gameOver = false;
        gameStarted = true;

        // Generate initial food position
        generateFood();
    }

    // Generate random food position
    private void generateFood() {
        int x, y;
        do {
            x = random.nextInt(GAME_UNITS);
            y = random.nextInt(GAME_UNITS);
        } while (isSnakeOn(x, y)); // Make sure food doesn't spawn on snake

        foodX = x * GRID_SIZE + 50; // Adjust position for grid
        foodY = y * GRID_SIZE + 50;
    }

    // Check if food is on snake body
    private boolean isSnakeOn(int x, int y) {
        for (int i = 0; i < GAME_UNITS; i++) {
            if (snakeX[i] == x && snakeY[i] == y) {
                return true;
            }
        }
        return false;
    }

    // Game state
    private GameState gameState;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        switch (gameState) {
            case MENU:
                drawMenu(g);
                break;
            case PLAYING:
                drawGame(g);
                break;
            case GAME_OVER:
                drawGameOver(g);
                break;
        }
    }

    // Draw the game menu
    private void drawMenu(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 40));

        // Title
        String title = "SNAKE GAME";
        int titleX = WIDTH / 2 - g.getFontMetrics().stringWidth(title) / 2;
        int titleY = HEIGHT / 3;
        g.drawString(title, titleX, titleY);

        // Start instruction
        String startInstr = "Press SPACE to Start";
        int instrX = WIDTH / 2 - g.getFontMetrics().stringWidth(startInstr) / 2;
        int instrY = HEIGHT * 2/3;
        g.setColor(Color.CYAN);
        g.drawString(startInstr, instrX, instrY);

        // Score display
        if (gameStarted && !gameOver) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.PLAIN, 20));
            String scoreText = "Score: " + score;
            int scoreX = WIDTH / 2 - g.getFontMetrics().stringWidth(scoreText) / 2;
            int scoreY = HEIGHT * 3/4;
            g.drawString(scoreText, scoreX, scoreY);
        }
    }

    // Draw the game elements
    private void drawGame(Graphics g) {
        if (!gameStarted || gameOver) return;

        // Draw snake head (green)
        g.setColor(Color.GREEN);
        int x = snakeX[0];
        int y = snakeY[0];
        g.fillRect(x, y, GRID_SIZE, GRID_SIZE);

        // Draw snake body (light green)
        for (int i = 1; i < GAME_UNITS; i++) {
            if (snakeX[i] != -1) { // Only draw segments that exist
                g.setColor(LIGHT_GREEN);
                int xSegment = snakeX[i];
                int ySegment = snakeY[i];
                g.fillRect(xSegment, ySegment, GRID_SIZE, GRID_SIZE);
            }
        }

        // Draw food (red)
        g.setColor(Color.RED);
        g.fillOval(foodX - 5, foodY - 5, GRID_SIZE + 10, GRID_SIZE + 10);

        // Score display
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        String scoreText = "Score: " + score;
        int scoreX = WIDTH / 2 - g.getFontMetrics().stringWidth(scoreText) / 2;
        int scoreY = HEIGHT * 3/4;
        g.drawString(scoreText, scoreX, scoreY);
    }

    // Draw game over screen
    private void drawGameOver(Graphics g) {
        if (!gameOver || !gameStarted) return;

        gameState = GameState.GAME_OVER;

        // Game over message
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        String gameOverText = "GAME OVER";
        int textX = WIDTH / 2 - g.getFontMetrics().stringWidth(gameOverText) / 2;
        int textY = HEIGHT / 3;
        g.drawString(gameOverText, textX, textY);

        // Final score
        g.setColor(Color.CYAN);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        String scoreText = "Final Score: " + score;
        int scoreX = WIDTH / 2 - g.getFontMetrics().stringWidth(scoreText) / 2;
        int scoreY = HEIGHT * 2/3;
        g.drawString(scoreText, scoreX, scoreY);

        // Restart instruction
        String restartInstr = "Press R to Restart";
        g.setColor(Color.GREEN);
        g.setFont(new Font("Arial", Font.PLAIN, 15));
        int restartX = WIDTH / 2 - g.getFontMetrics().stringWidth(restartInstr) / 2;
        int restartY = HEIGHT * 3/4 + 30;
        g.drawString(restartInstr, restartX, restartY);
    }

    // Move the snake
    private void moveSnake() {
        for (int i = GAME_UNITS - 1; i > 0; i--) {
            snakeX[i] = snakeX[i-1];
            snakeY[i] = snakeY[i-1];
        }

        switch (currentDirection) {
            case UP:
                snakeY[0] -= GRID_SIZE;
                break;
            case DOWN:
                snakeY[0] += GRID_SIZE;
                break;
            case LEFT:
                snakeX[0] -= GRID_SIZE;
                break;
            case RIGHT:
                snakeX[0] += GRID_SIZE;
                break;
        }
    }

    // Check if the snake eats food
    private boolean isFoodEaten() {
        return snakeX[0] == foodX && snakeY[0] == foodY;
    }

    // Increase score and generate new food
    private void eatFood() {
        score++;

        int lastX = snakeX[GAME_UNITS - 1];
        int lastY = snakeY[GAME_UNITS - 1];

        // Add a new segment to the snake (at the end)
        for (int i = GAME_UNITS; i > 0; i--) {
            snakeX[i] = snakeX[i-1];
            snakeY[i] = snakeY[i-1];
        }

        // Move the last segment
        snakeX[0] = lastX;
        snakeY[0] = lastY;

        generateFood();
    }

    // Check if game is over (snake hits wall or itself)
    private boolean checkGameOver() {
        int headX = snakeX[0];
        int headY = snakeY[0];

        // Check wall collision
        if (headX < 0 || headX >= WIDTH - GRID_SIZE) return true;
        if (headY < 0 || headY >= HEIGHT - GRID_SIZE) return true;

        // Check self collision (skip the first segment which is the head)
        for (int i = 1; i < GAME_UNITS; i++) {
            int bodyX = snakeX[i];
            int bodyY = snakeY[i];

            if (headX == bodyX && headY == bodyY) return true;
        }

        return false;
    }

    // Handle key presses
    @Override
    public void keyPressed(KeyEvent e) {
        switch (gameState) {
            case MENU:
                startGame();
                break;

            case PLAYING:
                if (!gameStarted || gameOver) return;

                int key = e.getKeyCode();

                // Prevent reversing direction directly into the snake's body
                switch (key) {
                    case KeyEvent.VK_UP:
                        if (currentDirection != Direction.DOWN) currentDirection = Direction.UP;
                        break;

                    case KeyEvent.VK_DOWN:
                        if (currentDirection != Direction.UP) currentDirection = Direction.DOWN;
                        break;

                    case KeyEvent.VK_LEFT:
                        if (currentDirection != Direction.RIGHT) currentDirection = Direction.LEFT;
                        break;

                    case KeyEvent.VK_RIGHT:
                        if (currentDirection != Direction.LEFT) currentDirection = Direction.RIGHT;
                        break;
                }

                // Restart game after pressing R
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    // Game loop update method
    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameState == GameState.PLAYING && gameStarted && !gameOver) {
            moveSnake();

            // Check for food collision
            boolean ate = isFoodEaten();
            if (ate) {
                eatFood();
            }

            // Check for game over condition
            gameOver = checkGameOver();
            repaint();
        }
    }

    // Main method to run the game
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");

        SnakeGame snakeGame = new SnakeGame();

        frame.add(snakeGame);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Start the timer for game updates
        snakeGame.timer.start();
    }

}
