from sklearn import svm

# 准备数据
X = [[1, 2], [2, 2], [4, 4], [5, 6]]
Y = [1, 1, -1, -1]

# 创建SVM模型
model = svm.SVC(kernel='linear')  # 选择线性核

# 拟合模型
model.fit(X, Y)

# 预测决策边界
# 创建一个网格来绘制决策边界
import numpy as np
import matplotlib.pyplot as plt

# 生成网格点
x_min, x_max = min(X, key=lambda x: x[0])[0] - 1, max(X, key=lambda x: x[0])[0] + 1
y_min, y_max = min(X, key=lambda x: x[1])[1] - 1, max(X, key=lambda x: x[1])[1] + 1
xx, yy = np.meshgrid(np.arange(x_min, x_max, 0.1),
                     np.arange(y_min, y_max, 0.1))


# 预测网格点的类别
Z = model.predict(np.c_[xx.ravel(), yy.ravel()])
Z = Z.reshape(xx.shape)

# 绘制决策边界和支持向量
plt.contourf(xx, yy, Z, alpha=0.8)
# plt.scatter(X[:, 0], X[:, 1], c=Y)
plt.xlabel('X')
plt.ylabel('Y')
plt.title('SVM Decision Boundary')
plt.show()