package org.rank.strategy;

import org.rank.strategy.context.RankContext;

import org.springframework.stereotype.Service;

@Service
public class CouponPredictPhase  implements IRankCouponPhase  {

	@Override
	public void execute(RankContext context) {
		 System.out.println(String.format("IRankCouponPhase:%s", "CouponPredictPhase") );
	}

}
