package leetcode;

import java.util.ArrayList;
import java.util.List;


public class InsertInterval {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> res = new ArrayList<Interval>();
		if (intervals == null || intervals.size() == 0) {
			res.add(newInterval);
			return res;
		}
		int i = 0;
		while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
			res.add(intervals.get(i));
			i++;
		}
		if (i < intervals.size()) {
			newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
		}
		
		while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
			newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
			i++;
		}
		res.add(newInterval);
		while (i < intervals.size()) {
			res.add(intervals.get(i));
			i++;
		}
		return res;
	}
}
