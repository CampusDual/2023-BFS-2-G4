package com.grupo4.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository(value ="UserCompetitionDao")
@ConfigurationFile(
        configurationFile = "dao/UserCompetitionDao.xml",
        configurationFilePlaceholder = "dao/placeholders.properties")
public class UserCompetitionDao extends OntimizeJdbcDaoSupport {

    public static final String UC_ID = "UC_ID";
    public static final String COMP_ID = "COMP_ID";
    public static final String USER_ = "USER_";
    public static final String TEAM_ID = "TEAM_ID";
    public static final String UC_AVAILABLE_MONEY = "UC_AVAILABLE_MONEY";
    public static final String UC_POINTS = "UC_POINTS";
}
