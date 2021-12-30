package pro.sky.java.course2.coursework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.course2.examinerservice.Question;
import pro.sky.java.course2.examinerservice.service.ExaminerService;
import pro.sky.java.course2.examinerservice.service.ExaminerServiceImpl;
import pro.sky.java.course2.examinerservice.service.JavaQuestionService;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.ArgumentMatchers.*;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {
    @Mock
    private ExaminerServiceImpl examinerServiceImpl;

    @Test
    public void shouldCallQuestionServiceMethodWhenAddAndRemoveElement() {
        Question question = new Question("Сколько будет 5 + 5", "5 + 5 = 10");

        when(examinerServiceImpl.add(question)).thenReturn(question);
        when(examinerServiceImpl.remove(question)).thenReturn(question);
        assertEquals(question,examinerServiceImpl.add(question));
        assertEquals(question,examinerServiceImpl.remove(question));
    }
}
