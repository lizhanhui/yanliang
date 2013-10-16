package tv.yanliang.service;

import org.apache.log4j.Logger;

import javax.ejb.Stateless;

@Stateless
public class UserServiceBean implements UserServiceLocal, UserServiceRemote {

    private static Logger logger = Logger.getLogger(UserServiceBean.class);

    @Override
    public void greet() {
        logger.debug("It works!");

    }
}
