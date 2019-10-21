package com.foxploit.ignio.deviceanalysisservice.service;

import java.util.List;

/**
 * Service Interface for managing Analysis Service.
 */
public interface AnalysisService {

    abstract float approximateRegression(List<Float> y);

    abstract int resolveSlopeLevel(float slope);

    abstract int resolveAlertLevel(int weight);
}
