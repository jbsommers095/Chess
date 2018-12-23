import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.ImageIcon;

public class Queen extends Piece implements java.io.Serializable{
 static int whitenewId = 1;
 static int blacknewId = 1;
 int kingDirection = -1;
 public Queen(int id, Color color, Position pos, ImageIcon image, String name) {
  setId(id);
  setColor(color);
  setPosition(pos);
  setImage(image);
  setName(name);
 }
 public void setPath(Board board, TileButton t) {
   this.path.clear();
  Color c = this.getColor();
  int x = t.getTile().getPosition().getX();
  int y = t.getTile().getPosition().getY();
  this.path.add(t);
  this.checkPath.clear();
  this.allies.clear();
  boolean foundKing = false;
  this.kingDirection = -1;
  TileButton theKing = null;
  while(y > 0 && x > 0) {
   y -= 1;
   x -= 1;
   TileButton til = board.tiles[y][x];
   if (til.getTile().getPiece() != null) {
    Color otherCol = til.getTile().getPiece().getColor();
    if (!c.equals(otherCol)) {
     this.path.add(til);
     if (til.getTile().getPiece() instanceof King) {
       this.checkPath.add(til);
       foundKing = true;
       this.kingDirection = 7;
       theKing = til;
     }
     else {
       if (!foundKing) {
         this.checkPath.clear();
         //this.checkPath.add(t);
       }
     }
     break;
    }
    else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     this.allies.add(til);
     break;
    }
   }
   else {
     if (!foundKing) {
       this.checkPath.add(til);
     }
    this.path.add(til);
   }
  }
    if (!foundKing) {
       this.checkPath.clear();
    }
  y = t.getTile().getPosition().getY();
  x = t.getTile().getPosition().getX();
  while(x < 7 && y > 0) {
   x += 1;
   y -= 1;
   TileButton til = board.tiles[y][x];
   if (til.getTile().getPiece() != null) {
    Color otherCol = til.getTile().getPiece().getColor();
    if (!c.equals(otherCol)) {
     this.path.add(til);
     if (til.getTile().getPiece() instanceof King) {
       this.checkPath.add(til);
       foundKing = true;
       this.kingDirection = 1;
       theKing = til;
     }
     else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     }
     break;
    }
    else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     this.allies.add(til);
     break;
    }
   }
   else {
     if (!foundKing) {
       this.checkPath.add(til);
     }
    this.path.add(til);
   }
  }
    if (!foundKing) {
       this.checkPath.clear();
    }
  x = t.getTile().getPosition().getX();
  y = t.getTile().getPosition().getY();
  while(y < 7 && x > 0) {
   y += 1;
   x -= 1;
   TileButton til = board.tiles[y][x];
   if (til.getTile().getPiece() != null) {
    Color otherCol = til.getTile().getPiece().getColor();
    if (!c.equals(otherCol)) {
     this.path.add(til);
     if (til.getTile().getPiece() instanceof King) {
       this.checkPath.add(til);
       foundKing = true;
       this.kingDirection = 5;
       theKing = til;
     }
     else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     }
     break;
    }
    else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     this.allies.add(til);
     break;
    }
   }
   else {
     if (!foundKing) {
       this.checkPath.add(til);
     }
    this.path.add(til);
   }
  }
    if (!foundKing) {
       this.checkPath.clear();
    }
  y = t.getTile().getPosition().getY();
  x = t.getTile().getPosition().getX();
  while (x < 7 && y < 7) {
   x += 1;
   y += 1;
   TileButton til = board.tiles[y][x];
   if (til.getTile().getPiece() != null) {
    Color otherCol = til.getTile().getPiece().getColor();
    if (!c.equals(otherCol)) {
     this.path.add(til);
     if (til.getTile().getPiece() instanceof King) {
       this.checkPath.add(til);
       foundKing = true;
       this.kingDirection = 3;
       theKing = til;
     }
     else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     }
     break;
    }
    else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     this.allies.add(til);
     break;
    }
   }
   else {
     if (!foundKing) {
       this.checkPath.add(til);
     }
    this.path.add(til);
   }
  }
    if (!foundKing) {
       this.checkPath.clear();
    }
  y = t.getTile().getPosition().getY();
  x = t.getTile().getPosition().getX();
  while(y > 0) {
   y -= 1;
   TileButton til = board.tiles[y][x];
   if (til.getTile().getPiece() != null) {
    Color otherCol = til.getTile().getPiece().getColor();
    if (!c.equals(otherCol)) {
     this.path.add(til);
     if (til.getTile().getPiece() instanceof King) {
       this.checkPath.add(til);
       foundKing = true;
       this.kingDirection = 0;
       theKing = til;
     }
     else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     }
     break;
    }
    else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     this.allies.add(til);
     break;
    }
   }
   else {
     if (!foundKing) {
       this.checkPath.add(til);
     }
    this.path.add(til);
   }
  }
    if (!foundKing) {
       this.checkPath.clear();
    }
  y = t.getTile().getPosition().getY();
  while(x < 7) {
   x += 1;
   TileButton til = board.tiles[y][x];
   if (til.getTile().getPiece() != null) {
    Color otherCol = til.getTile().getPiece().getColor();
    if (!c.equals(otherCol)) {
     this.path.add(til);
     if (til.getTile().getPiece() instanceof King) {
       this.checkPath.add(til);
       foundKing = true;
       this.kingDirection = 2;
       theKing = til;
     }
     else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     }
     break;
    }
    else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     this.allies.add(til);
     break;
    }
   }
   else {
     if (!foundKing) {
       this.checkPath.add(til);
     }
    this.path.add(til);
   }
  }
    if (!foundKing) {
       this.checkPath.clear();
    }
  x = t.getTile().getPosition().getX();
  while(y < 7) {
   y += 1;
   TileButton til = board.tiles[y][x];
   if (til.getTile().getPiece() != null) {
    Color otherCol = til.getTile().getPiece().getColor();
    if (!c.equals(otherCol)) {
     this.path.add(til);
     if (til.getTile().getPiece() instanceof King) {
       this.checkPath.add(til);
       foundKing = true;
       this.kingDirection = 4;
       theKing = til;
     }
     else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     }
     break;
    }
    else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     this.allies.add(til);
     break;
    }
   }
   else {
       if (!foundKing) {
         this.checkPath.add(til);
       }
    this.path.add(til);
   }
  }
    if (!foundKing) {
       this.checkPath.clear();
    }
  y = t.getTile().getPosition().getY();
  while (x > 0) {
   x -= 1;
   TileButton til = board.tiles[y][x];
   if (til.getTile().getPiece() != null) {
    Color otherCol = til.getTile().getPiece().getColor();
    if (!c.equals(otherCol)) {
     this.path.add(til);
     if (til.getTile().getPiece() instanceof King) {
       this.checkPath.add(til);
       foundKing = true;
       this.kingDirection = 6;
       theKing = til;
     }
     else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     }
     break;
    }
    else {
       if (!foundKing) {
         this.checkPath.clear();
       }
     this.allies.add(til);
     break;
    }
   }
   else {
     if (!foundKing) {
       this.checkPath.add(til);
     }
    this.path.add(til);
   }
  }
    if (!foundKing) {
       this.checkPath.clear();
    }
  Board.checkPaths.put(this, this.checkPath);
 }
 public void furtherReducePath() {
  if (kingDirection >= 0) {
    System.out.println("RECHECK: " + this.kingDirection);
    int x = Game.board.kingsButton[Game.turnCount % 2].getTile().getPosition().getX();
    int y = Game.board.kingsButton[Game.turnCount % 2].getTile().getPosition().getY();
    switch(kingDirection) {
      case 0 : {
        if (y - 1 >= 0) {
          if (Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().contains(Game.board.tiles[y - 1][x])) {
            Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().remove(Game.board.tiles[y - 1][x]);
          }
        }
        break;
      }
      case 1 : {
        if (x + 1 < 8 && y - 1 >= 0) {
          if (Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().contains(Game.board.tiles[y - 1][x + 1])) {
            Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().remove(Game.board.tiles[y - 1][x + 1]);
          }
        }
        break;
      }
      case 2 : {
        if (x + 1 < 8) {
          if (Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().contains(Game.board.tiles[y][x + 1])) {
            Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().remove(Game.board.tiles[y][x + 1]);
          }
        }
        break;
      }
      case 3 : {
        if (y + 1 < 8 && x + 1 < 8) {
          if (Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().contains(Game.board.tiles[y + 1][x + 1])) {
            Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().remove(Game.board.tiles[y + 1][x + 1]);
          }
        }
        break;
      }
      case 4 : {
        if (y + 1 < 8) {
          if (Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().contains(Game.board.tiles[y + 1][x])) {
            Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().remove(Game.board.tiles[y + 1][x]);
          }
        }
        break;
      }
      case 5 : {
        if (y + 1 < 8 && x - 1 >= 0) {
          if (Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().contains(Game.board.tiles[y + 1][x - 1])) {
            Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().remove(Game.board.tiles[y + 1][x - 1]);
          }
        }
        break;
      }
      case 6 : {
        if (x - 1 >= 0) {
          if (Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().contains(Game.board.tiles[y][x - 1])) {
            Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().remove(Game.board.tiles[y][x - 1]);
          }
        }
        break;
      }
      case 7 : {
        if (y - 1 >= 0 && x - 1 >= 0) {
          if (Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().contains(Game.board.tiles[y - 1][x - 1])) {
            Game.board.kingsButton[Game.turnCount % 2].getTile().getPiece().getPath().remove(Game.board.tiles[y - 1][x - 1]);
          }
        }
        break;
      }
    }
  }
  }
 public static void main(String[] args) {
   Board board = new Board();
  TileButton[][] tiles = board.tiles;
  TileButton t = tiles[0][3];
  int n = Constants.TILEWIDTH;
  Piece p = t.getTile().getPiece();
  System.out.println(p);
  Queen q = (Queen) p;
  q.setPath(board, t);
  for (TileButton til : p.path)
  System.out.println(til.getTile().getX() / n + ", " + til.getTile().getY() / n);
 }
}