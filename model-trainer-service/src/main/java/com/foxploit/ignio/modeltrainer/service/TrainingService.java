package com.foxploit.ignio.modeltrainer.service;

import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.dataset.DataSet;

/**
 * @author Sebastien Bortolussi
 */
public interface TrainingService {
    MultiLayerNetwork train(DataSet trainData, DataSet testData);
}
