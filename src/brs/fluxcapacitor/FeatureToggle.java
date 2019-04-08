package brs.fluxcapacitor;

import brs.fluxcapacitor.FluxHistory.Element;

public enum FeatureToggle {

  REWARD_RECIPIENT_ENABLE(new FluxHistory<>(false, new Element<>(HistoricalMoments.REWARD_RECIPIENT_ENABLE, true))),
  DIGITAL_GOODS_STORE(new FluxHistory<>(false, new Element<>(HistoricalMoments.DIGITAL_GOODS_STORE_BLOCK, true))),
  AUTOMATED_TRANSACTION_BLOCK(new FluxHistory<>(false, new Element<>(HistoricalMoments.AUTOMATED_TRANSACTION_BLOCK, true))),
  AT_FIX_BLOCK_2(new FluxHistory<>(false, new Element<>(HistoricalMoments.AT_FIX_BLOCK_2, true))),
  AT_FIX_BLOCK_3(new FluxHistory<>(false, new Element<>(HistoricalMoments.AT_FIX_BLOCK_3, true))),
  AT_FIX_BLOCK_4(new FluxHistory<>(false, new Element<>(HistoricalMoments.AT_FIX_BLOCK_4, true))),
  POC2(new FluxHistory<>(false, new Element<>(HistoricalMoments.POC2, true))),
  PRE_DYMAXION(new FluxHistory<>(false, new Element<>(HistoricalMoments.PRE_DYMAXION, true))),
  AT2(new FluxHistory<>(false, new Element<>(HistoricalMoments.AT2, true))),
  NEXT_FORK(new FluxHistory<>(false, new Element<>(HistoricalMoments.NEXT_FORK, true)));

  private final FluxHistory<Boolean> flux;

  FeatureToggle(FluxHistory<Boolean> flux) {
    this.flux = flux;
  }

  public FluxHistory<Boolean> getFlux() {
    return flux;
  }

}
