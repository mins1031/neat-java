package com.company.Collections;

import com.company.common.Point;

import java.util.HashSet;
import java.util.Set;

public class SetStudy1 {
    public static void main(String[] args){
        //HashSet에서 두Point가 같은지 아닌지 판단하려면 hashCode()와 equals() 메서드를
        //구현해야한다. hashCode() 값이 같고 equals가 true면 같은 오브젝트로 간주하게 구현.

        Set<Point> points = new HashSet<>();
        Point p1 = new Point(3,4);
        Point p2 = new Point(1,2);
        Point p3 = new Point(1,2);

        points.add(p1);
        points.add(p2);
        points.add(p3);
        System.out.println(points);

        System.out.println(p2.equals(p3));
        /**
         * 우선 Set은 두값을 비교하기 전에 해시코드값으로 먼저 바꿔 비교후 값이 다르면 다른 객체, 같으면 그때
         * equals로 비교해 true값으로 바꿔 시간단축을 꾀한다.해서 '검색'속도가 매우 빠르다.
         * 해시코드는 32비트로 표현되고 32비트는 40억가지의 값을 표현가능하기에 겹치는 수가 나올확률이 있기때문에
         * 이중으로 검증해준다.+또한 해시코드가 더 빠르다고 한다. 속도에 초점을 맞춘 방식.
         * */

    }
}
