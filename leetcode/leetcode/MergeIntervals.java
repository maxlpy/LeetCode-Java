package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
	int start;
	int end;
	public Interval() {}
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}
public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<Interval>();
		if (intervals == null || intervals.size() == 0) {
			return intervals;
		}
		Comparator<Interval> comp = new Comparator<Interval>() {

			@Override
			public int compare(Interval i1, Interval i2) {
				// TODO Auto-generated method stub
				if (i1.start == i2.start) {
					return i1.end - i2.end;
				}
				return i1.start - i2.start;
			}
		};
		Collections.sort(intervals, comp);
		res.add(intervals.get(0));
		for (int i = 1; i < intervals.size(); i++) {
			if (res.get(res.size()-1).end >= intervals.get(i).start) {
				res.get(res.size()-1).end = Math.max(res.get(res.size()-1).end, intervals.get(i).end);
			} else {
				res.add(intervals.get(i));
			}
		}
		return res;
	}
}
