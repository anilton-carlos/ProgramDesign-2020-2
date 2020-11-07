import java.awt.Point;
import java.util.*;

public class SnakeJogador {
	public class SnakePoint implements Comparable<SnakePoint> {
		private int x, y;
		private int ID;
		private int distFromStart = 0;
		private int distManhattan = 0;

		private SnakePoint parent = null;

		public SnakePoint(int x, int y, int ID) {
			this.ID = ID;
			this.x = x;
			this.y = y;
		}

		public int getId() {
			return ID;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public void setX(int x) {
			this.x = x;
		}

		public void setDistFromStart(int dist) {
			distFromStart = dist;
		}

		public int getDistFromStart() {
			return distFromStart;
		}

		public void setDistManhattan(int dist) {
			distManhattan = dist;
		}

		public int getDistManhattan() {
			return distManhattan;
		}

		public void setParent(SnakePoint parent) {
			this.parent = parent;
		}

		public SnakePoint getParent() {
			return parent;
		}

		public List<SnakePoint> getNeighborhood() {
			List<SnakePoint> list = new ArrayList<>();
			if (x - 1 >= 0 && (x - 1) < jogo.getLargura())
				list.add(boardGameList.get((x - 1) * jogo.getAltura() + y));
			if (x + 1 >= 0 && (x + 1) < jogo.getLargura())
				list.add(boardGameList.get((x + 1) * jogo.getAltura() + y));
			if (y - 1 >= 0 && (y - 1) < jogo.getAltura())
				list.add(boardGameList.get(x * jogo.getAltura() + (y - 1)));
			if (y + 1 >= 0 && (y + 1) < jogo.getAltura())
				list.add(boardGameList.get(x * jogo.getAltura() + (y + 1)));
			/*
			 * SnakePoint down = new SnakePoint(x + 1, y); SnakePoint left = new
			 * SnakePoint(x, y + 1); SnakePoint right = new SnakePoint(x, y - 1);
			 * 
			 * if (up.isEmptyPoint()) list.add(up); if (down.isEmptyPoint()) list.add(down);
			 * if (left.isEmptyPoint()) list.add(left); if (right.isEmptyPoint())
			 * list.add(right);
			 */
			return list;
		}

		public boolean equal(SnakePoint snake) {
			if (this.x == snake.getX() && this.y == snake.getY())
				return true;

			return false;
		}

		public boolean isEmptyPoint() {
			return jogo.isCelulaLivre(x, y);
		}

		public int getTotalDist() {
			return distFromStart + distManhattan;
		}

		public int compareTo(SnakePoint anotherPoint) {
			int distTotal = this.getTotalDist();
			int anotherDist = anotherPoint.getTotalDist();

			int distance = distTotal - anotherDist;

			return (distance > 0) ? 1 : (distance < 0) ? -1 : 0;
		}

	}

	private Snake jogo;

	private LinkedList<Character> charPath = new LinkedList<Character>();
	private List<SnakePoint> boardGameList = new ArrayList<SnakePoint>();

	public SnakeJogador(Snake jogo) {
		this.jogo = jogo;
		for (int i = 0; i < jogo.getLargura(); i++) {
			for (int j = 0; j < jogo.getAltura(); j++) {
				// Point point = new Point(i, j);
				SnakePoint boardPoint = new SnakePoint(i, j, i * jogo.getAltura() + j);
				boardGameList.add(boardPoint);
			}
		}
	}

	private int manhattanDist(SnakePoint start, SnakePoint dest) {
		int x = Math.abs(start.getX() - dest.getX());
		int y = Math.abs(start.getY() - dest.getY());

		return x + y;
	}

	private LinkedList<SnakePoint> makePath(SnakePoint point) {
		LinkedList<SnakePoint> path = new LinkedList<SnakePoint>();

		while (point.getParent() != null) {
			path.addFirst(point);
			point = point.getParent();
		}

		return path;
	}

	private LinkedList<SnakePoint> searchPath(SnakePoint start, SnakePoint dest) {
		LinkedList<SnakePoint> closedList = new LinkedList<SnakePoint>();
		PriorityQueue<SnakePoint> openList = new PriorityQueue<SnakePoint>();

		start.setDistFromStart(0);
		start.setDistManhattan(manhattanDist(start, dest));
		start.setParent(null);

		openList.add(start);

		while (openList.isEmpty() == false) {
			SnakePoint actualPoint = openList.remove();
			if (actualPoint == dest) {
				LinkedList<SnakePoint> pathToDest = makePath(actualPoint);
				return pathToDest;
			}
	/* 		if (openList.size() >= (jogo.getAltura() * jogo.getLargura() * 1000)) {
				return null;
			}
			if (closedList.size() >= (jogo.getAltura() * jogo.getLargura() * 1000))
				return null; */
			List<SnakePoint> neighborhood = actualPoint.getNeighborhood();

			for (int i = 0; i < neighborhood.size(); i++) {
				SnakePoint neighborPoint = neighborhood.get(i);

				int distFromStart = actualPoint.getDistFromStart() + manhattanDist(actualPoint, neighborPoint);

				boolean inOpenList = openList.contains(neighborPoint);
				boolean inClosedList = closedList.contains(neighborPoint);

				if (!inOpenList) {
					if (!inClosedList) {
						neighborPoint.setParent(actualPoint);
						neighborPoint.setDistFromStart(distFromStart);
						neighborPoint.setDistManhattan(manhattanDist(neighborPoint, dest));

						if (neighborPoint.isEmptyPoint()) {
							openList.add(neighborPoint);
						}
					}
				} else {
					i++;
					i--;
				}
			}
			closedList.add(actualPoint);
		}
		return null;
	}

	private LinkedList<Character> translatePath(SnakePoint snakeHead, LinkedList<SnakePoint> path) {
		LinkedList<Character> directions = new LinkedList<Character>();

		for (int i = 0; i < path.size(); i++) {
			int pathX = path.get(i).getX();
			int pathY = path.get(i).getY();

			int headX = snakeHead.getX();
			int headY = snakeHead.getY();

			if (pathX == headX) {
				if (pathY == headY - 1) {
					directions.add('C');
				} else if (pathY == headY + 1) {
					directions.add('B');
				}
			} else if (pathY == headY) {
				if (pathX == headX - 1) {
					directions.add('E');
				} else if (pathX == headX + 1) {
					directions.add('D');
				}
			} else {
				directions.add('N');
			}
			snakeHead = path.get(i);
		}

		return directions;
	}

	public char getDirecao() {

		if (charPath.isEmpty()) {
			//SnakePoint head = new SnakePoint(jogo.getSegmentos().getFirst().x, jogo.getSegmentos().getFirst().y);
			SnakePoint head = boardGameList.get(jogo.getSegmentos().getFirst().x * jogo.getAltura() + jogo.getSegmentos().getFirst().y);
			//SnakePoint food = new SnakePoint(jogo.getComida().x, jogo.getComida().y);
			SnakePoint food = boardGameList.get(jogo.getComida().x * jogo.getAltura() + jogo.getComida().y);
			LinkedList<SnakePoint> path = searchPath(head, food);
			if (path != null) {
				charPath = translatePath(head, path);
				char move = charPath.removeFirst();
				return move;
			} else {
				Point cabeca = jogo.getSegmentos().getFirst();

				ArrayList<Character> possiveisDirecoes = new ArrayList<Character>(4);

				if (jogo.isCelulaLivre(cabeca.x, cabeca.y - 1))
					possiveisDirecoes.add('C');
				if (jogo.isCelulaLivre(cabeca.x + 1, cabeca.y))
					possiveisDirecoes.add('D');
				if (jogo.isCelulaLivre(cabeca.x, cabeca.y + 1))
					possiveisDirecoes.add('B');
				if (jogo.isCelulaLivre(cabeca.x - 1, cabeca.y))
					possiveisDirecoes.add('E');

				if (possiveisDirecoes.size() == 0)
					return 'N';

				int posicao = new Random().nextInt(possiveisDirecoes.size());
				return possiveisDirecoes.get(posicao);
			}
		} else {
			char move = charPath.removeFirst();
			return move;
		}
	}

}
