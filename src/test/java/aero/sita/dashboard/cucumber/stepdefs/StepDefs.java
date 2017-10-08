package aero.sita.dashboard.cucumber.stepdefs;

import aero.sita.dashboard.DotsDashboardApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = DotsDashboardApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
