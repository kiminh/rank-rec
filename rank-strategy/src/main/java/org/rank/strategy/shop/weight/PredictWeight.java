package org.rank.strategy.shop.weight;

import org.rank.strategy.context.RankContext;
import org.rank.strategy.shop.face.IShopWeight;

public class PredictWeight implements IShopWeight{

	@Override
	public void doWeight(RankContext context) {
		System.out.println(String.format("IShopWeight:%s","PredictWeight"));
		
	}

}
