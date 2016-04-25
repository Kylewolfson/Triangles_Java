public class Triangle {

  private int mLength1;
  private int mLength2;
  private int mLength3;

  public Triangle(int length1, int length2, int length3) {
    mLength1 = length1;
    mLength2 = length2;
    mLength3 = length3;
  }
  public int getLength1() {
    return mLength1;
  }
  public int getLength2() {
    return mLength2;
  }
  public int getLength3() {
    return mLength3;
  }
  public boolean isTriangle() {
    return ((mLength1 + mLength2 > mLength3) && (mLength2 + mLength3 > mLength1) && (mLength1 + mLength3 > mLength2));
  }
  public boolean isEquilateral() {
    return (mLength1 == mLength2 && mLength2 == mLength3);
  }
  public boolean isIso() {
    return ((mLength1 == mLength2 || mLength2 == mLength3 || mLength1 == mLength3) && !isEquilateral() && isTriangle());
  }
  public boolean isScalene() {
    return ((mLength1 != mLength2 && mLength1 != mLength3 && mLength2 != mLength3) && isTriangle());
  }


}
