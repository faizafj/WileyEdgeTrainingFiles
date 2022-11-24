package client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import persistence.StudentDaoImpl;
import presentation.StudentPresentation;
import presentation.StudentPresentationImpl;
import service.StudentServiceImpl;

@Configuration
public class StudentConfiguration {
    @Bean(name = "dao")
    public StudentDaoImpl getPersistence() {
        return new StudentDaoImpl();
    }

    @Bean(name = "service")
    public StudentServiceImpl getService() {
        return new StudentServiceImpl(getPersistence());
    }

    @Bean(name = "presentation")
    public StudentPresentation getStudentPresentation() {
        StudentPresentationImpl presentation = new StudentPresentationImpl();
        presentation.setStudentService(getService());
        return presentation;
    }
}

