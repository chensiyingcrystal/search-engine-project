package team.dsys.dssearch.cluster;

import com.typesafe.config.ConfigFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import team.dsys.dssearch.cluster.config.ClusterServiceConfig;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllLines;

public class RunCluster {

    private static final Logger LOGGER = LoggerFactory.getLogger(RunCluster.class);

    public static void main(String[] args) {
        String configFileName = getConfigFileName(args);
        LOGGER.info("Reading config from " + configFileName);

        ClusterService cluster;
        ClusterServiceConfig config = readConfigFile(configFileName);
//        if (config.getRaftGroupConfig().getJoinTo() == null) {
//            cluster = ClusterService.bootstrap(config);
//        } else {
//            cluster = ClusterService.join(config, true /* votingMember */);
//        }

//        cluster.awaitTermination();
    }

    private static String getConfigFileName(String[] args) {
        String prop = System.getProperty("afloatdb.config");
        if (args.length > 0) {
            return args[0];
        } else if (prop != null) {
            return prop;
        } else {
            LOGGER.error("Config file location must be provided either via program argument or system parameter: "
                    + "\"afloatdb.config\"! If both are present, program argument is used.");
            System.exit(-1);
            return null;
        }
    }

    private static ClusterServiceConfig readConfigFile(String configFileName) {
        try {
            String config = String.join("\n", readAllLines(Paths.get(configFileName), StandardCharsets.UTF_8));
            return ClusterServiceConfig.from(ConfigFactory.parseString(config));
        } catch (IOException e) {
            LOGGER.error("Cannot read config file: " + configFileName, e);
            System.exit(-1);
            return null;
        }
    }

}

